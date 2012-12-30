package com.ujcr.nodetype;

import javax.jcr.RepositoryException;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.nodetype.InvalidNodeTypeDefinitionException;
import javax.jcr.nodetype.NoSuchNodeTypeException;
import javax.jcr.nodetype.NodeDefinitionTemplate;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeDefinition;
import javax.jcr.nodetype.NodeTypeExistsException;
import javax.jcr.nodetype.NodeTypeIterator;
import javax.jcr.nodetype.NodeTypeManager;
import javax.jcr.nodetype.NodeTypeTemplate;
import javax.jcr.nodetype.PropertyDefinitionTemplate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


@Service
public class NodeTypeManagerImpl implements NodeTypeManager,ApplicationContextAware {

	@Autowired
	private NodeTypeRepository nodeTypeRepository;
	private ApplicationContext applicationContext;
	
	
	public NodeType getNodeType(String nodeTypeName) throws NoSuchNodeTypeException, RepositoryException {
		return nodeTypeRepository.findByPropertyValue("name", nodeTypeName);
	}

	public boolean hasNodeType(String name) throws RepositoryException {
		return nodeTypeRepository.findByPropertyValue("name", name)!=null;
	}

	public NodeTypeIterator getAllNodeTypes() throws RepositoryException {
		return new NodeTypeIteratorImpl(nodeTypeRepository.findAll().iterator());
	}

	public NodeTypeIterator getPrimaryNodeTypes() throws RepositoryException {
		return new NodeTypeIteratorImpl(nodeTypeRepository.findAllByPropertyValue("mixin", false).iterator());
	}

	public NodeTypeIterator getMixinNodeTypes() throws RepositoryException {
		return new NodeTypeIteratorImpl(nodeTypeRepository.findAllByPropertyValue("mixin", true).iterator());
	}

	public NodeTypeTemplate createNodeTypeTemplate() throws UnsupportedRepositoryOperationException, RepositoryException {
		return new NodeTypeImpl();
	}

	public NodeTypeTemplate createNodeTypeTemplate(NodeTypeDefinition ntd) throws UnsupportedRepositoryOperationException, RepositoryException {
		return new NodeTypeImpl(ntd);
	}

	public NodeDefinitionTemplate createNodeDefinitionTemplate() throws UnsupportedRepositoryOperationException, RepositoryException {
		return new NodeDefinitionTemplateImpl();
	}

	public PropertyDefinitionTemplate createPropertyDefinitionTemplate() throws UnsupportedRepositoryOperationException, RepositoryException {
		return new PropertyDefinitionImpl();
	}

	public NodeType registerNodeType(NodeTypeDefinition ntd, boolean allowUpdate) throws InvalidNodeTypeDefinitionException, NodeTypeExistsException, UnsupportedRepositoryOperationException, RepositoryException {
		return null;
	}

	public NodeTypeIterator registerNodeTypes(NodeTypeDefinition[] ntds, boolean allowUpdate) throws InvalidNodeTypeDefinitionException, NodeTypeExistsException, UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void unregisterNodeType(String name) throws UnsupportedRepositoryOperationException, NoSuchNodeTypeException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void unregisterNodeTypes(String[] names) throws UnsupportedRepositoryOperationException, NoSuchNodeTypeException, RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
		
	}
}