package com.open;

import javax.jcr.Repository;
import javax.jcr.RepositoryFactory;
import javax.jcr.SimpleCredentials;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeTemplate;

import com.ujcr.RepositoryFactoryImpl;
import com.ujcr.nodetype.NodeTypeManagerImpl;

public class Program {

	public static void main(String[] args) throws Throwable {
//		RepositoryFactory factory = new uRepositoryFactory();
//		Repository repository = factory.getRepository(null);
//		repository.login(new SimpleCredentials("admin", "admin".toCharArray()));

		NodeTypeManagerImpl nodeTypeManager = new NodeTypeManagerImpl();
		NodeTypeTemplate template = nodeTypeManager.createNodeTypeTemplate();
		template.setName("xql");
		nodeTypeManager.registerNodeType(template, false);
		
		NodeType nt= nodeTypeManager.getNodeType("xql");
		System.out.println(nt.getName());
		System.out.println("OK");
	}

}