package com.ujcr.nodetype;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import javax.jcr.RepositoryException;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeManager;
import javax.jcr.nodetype.NodeTypeTemplate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.kernel.InternalAbstractGraphDatabase;
import org.neo4j.kernel.impl.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.node.Neo4jHelper;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class nodetypeTest {

	@Autowired
	private Neo4jTemplate neo4jTemplate;

	@Autowired
	private NodeTypeManager nodeTypeManager;
	
	@Rollback(false)
    @BeforeTransaction
    public void clearDatabase()
    {
		Neo4jHelper.cleanDb(neo4jTemplate);
    }


	@Test
	public void test() throws RepositoryException {
		
//		   ConfigurableApplicationContext applicationContext =  
//		        	new ClassPathXmlApplicationContext( "/spring/helloWorldContext.xml");
		
		NodeTypeTemplate template = nodeTypeManager.createNodeTypeTemplate();
		template.setName("xql");
		nodeTypeManager.registerNodeType(template, false);

		NodeType nt = nodeTypeManager.getNodeType("xql");
		System.out.println(nt.getName());
		System.out.println("OK");
	}

}


