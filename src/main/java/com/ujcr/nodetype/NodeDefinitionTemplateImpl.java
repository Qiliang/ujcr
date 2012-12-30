package com.ujcr.nodetype;

import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.ItemDefinition;
import javax.jcr.nodetype.NodeDefinition;
import javax.jcr.nodetype.NodeDefinitionTemplate;
import javax.jcr.nodetype.NodeType;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.data.annotation.Transient;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class NodeDefinitionTemplateImpl implements ItemDefinition, NodeDefinition, NodeDefinitionTemplate {
	
	@Indexed(unique = true)
	protected String name;
	protected boolean autoCreated;
	protected boolean mandatory;
	protected int opv;
	protected boolean protectedStatus;

	@Transient
	protected NodeType declaringNodeType;
	protected String[] requiredPrimaryTypeNames;
	protected String defaultPrimaryTypeName;
	protected boolean allowsSameNameSiblings;
	
	
	public NodeType[] getRequiredPrimaryTypes() {
		return null;
	}

	public String[] getRequiredPrimaryTypeNames() {
		return ArrayUtils.clone(requiredPrimaryTypeNames);
	}

	public NodeType getDefaultPrimaryType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDefaultPrimaryTypeName() {
		return defaultPrimaryTypeName;
	}

	public boolean allowsSameNameSiblings() {
		return allowsSameNameSiblings;
	}

	public NodeType getDeclaringNodeType() {
		return this.declaringNodeType;
	}

	public String getName() {
		return this.name;
	}

	public boolean isAutoCreated() {
		return this.autoCreated;
	}

	public boolean isMandatory() {
		return this.mandatory;
	}

	public int getOnParentVersion() {
		return this.opv;
	}

	public boolean isProtected() {
		return this.protectedStatus;
	}
	
	
	
	public void setName(String name) throws ConstraintViolationException {
		this.name = name;

	}

	public void setAutoCreated(boolean autoCreated) {
		this.autoCreated = autoCreated;

	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;

	}

	public void setOnParentVersion(int opv) {
		this.opv = opv;

	}

	public void setProtected(boolean protectedStatus) {
		this.protectedStatus = protectedStatus;

	}

	public void setRequiredPrimaryTypeNames(String[] names) throws ConstraintViolationException {
		this.requiredPrimaryTypeNames = names;

	}

	public void setDefaultPrimaryTypeName(String name) throws ConstraintViolationException {
		this.defaultPrimaryTypeName = name;

	}

	public void setSameNameSiblings(boolean allowSameNameSiblings) {
		this.allowsSameNameSiblings = allowSameNameSiblings;

	}
}