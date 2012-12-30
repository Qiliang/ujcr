package com.ujcr.nodetype;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.jcr.Value;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.NodeDefinition;
import javax.jcr.nodetype.NodeDefinitionTemplate;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeDefinition;
import javax.jcr.nodetype.NodeTypeIterator;
import javax.jcr.nodetype.NodeTypeTemplate;
import javax.jcr.nodetype.PropertyDefinition;
import javax.jcr.nodetype.PropertyDefinitionTemplate;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class NodeTypeImpl implements NodeTypeDefinition,NodeTypeTemplate,NodeType {

	@Indexed(unique = true)
	protected String name;
	protected String[] declaredSuperTypeNames = new String[] {};
	protected boolean abstractStatus;
	@Indexed
	protected boolean mixin;
	protected boolean orderable;
	protected String primaryItemName;
	protected boolean queryable;
	
	@RelatedTo(type = "DeclaredPropertyDefinition", direction = Direction.OUTGOING)
	protected Set<PropertyDefinitionTemplate> propertyDefinitions;
	
	@RelatedTo(type = "DeclaredChildNodeDefinition", direction = Direction.OUTGOING)
	protected Set<NodeDefinitionTemplate> nodeDefinitions;
	
	private final List<PropertyDefinitionTemplate> propertyDefinitionTemplates = new ArrayList<PropertyDefinitionTemplate>();
	private final List<NodeDefinitionTemplate> nodeDefinitionTemplates = new ArrayList<NodeDefinitionTemplate>();

	public NodeTypeImpl() {
	}

	public NodeTypeImpl(NodeTypeDefinition ntd) {
		this.name = ntd.getName();
		this.declaredSuperTypeNames = ntd.getDeclaredSupertypeNames();
		this.abstractStatus = ntd.isAbstract();
		this.mixin = ntd.isMixin();
		this.orderable = ntd.hasOrderableChildNodes();
		this.primaryItemName = ntd.getPrimaryItemName();
		this.queryable = ntd.isQueryable();
	}	

	public String getName() {
		return name;
	}

	public String[] getDeclaredSupertypeNames() {
		return declaredSuperTypeNames;
	}

	public boolean isAbstract() {
		return abstractStatus;
	}

	public boolean isMixin() {
		return mixin;
	}

	public boolean hasOrderableChildNodes() {
		return orderable;
	}

	public boolean isQueryable() {
		return queryable;
	}

	public String getPrimaryItemName() {
		return primaryItemName;
	}

	public PropertyDefinition[] getDeclaredPropertyDefinitions() {
		return propertyDefinitions.toArray(new PropertyDefinition[] {});
	}

	public NodeDefinition[] getDeclaredChildNodeDefinitions() {
		return nodeDefinitions.toArray(new NodeDefinitionTemplate[] {});
	}
	
	

	public void setName(String name) throws ConstraintViolationException {
		this.name = name;

	}

	public void setDeclaredSuperTypeNames(String[] names) throws ConstraintViolationException {
		this.declaredSuperTypeNames = names;

	}

	public void setAbstract(boolean abstractStatus) {
		this.abstractStatus = abstractStatus;

	}

	public void setMixin(boolean mixin) {
		this.mixin = mixin;

	}

	public void setOrderableChildNodes(boolean orderable) {
		this.orderable = orderable;

	}

	public void setPrimaryItemName(String name) throws ConstraintViolationException {
		this.primaryItemName = name;

	}

	public void setQueryable(boolean queryable) {
		this.queryable = queryable;
	}

	public List<PropertyDefinitionTemplate> getPropertyDefinitionTemplates() {
		return propertyDefinitionTemplates;
	}

	public List<NodeDefinitionTemplate> getNodeDefinitionTemplates() {
		return nodeDefinitionTemplates;
	}

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
	}

	
	
}