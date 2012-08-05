package com.ujcr.nodetype;

import javax.jcr.Value;
import javax.jcr.nodetype.NodeDefinition;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeIterator;
import javax.jcr.nodetype.PropertyDefinition;

public class NodeTypeImpl extends NodeTypeDefinitionImpl implements NodeType{

	public NodeType[] getSupertypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeType[] getDeclaredSupertypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeTypeIterator getSubtypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeTypeIterator getDeclaredSubtypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isNodeType(String nodeTypeName) {
		// TODO Auto-generated method stub
		return false;
	}

	public PropertyDefinition[] getPropertyDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeDefinition[] getChildNodeDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean canSetProperty(String propertyName, Value value) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canSetProperty(String propertyName, Value[] values) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canAddChildNode(String childNodeName) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canAddChildNode(String childNodeName, String nodeTypeName) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canRemoveItem(String itemName) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canRemoveNode(String nodeName) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canRemoveProperty(String propertyName) {
		// TODO Auto-generated method stub
		return false;
	}}