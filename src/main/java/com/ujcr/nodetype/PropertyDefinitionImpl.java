package com.ujcr.nodetype;

import javax.jcr.Value;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.ItemDefinition;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.PropertyDefinition;
import javax.jcr.nodetype.PropertyDefinitionTemplate;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class PropertyDefinitionImpl implements ItemDefinition, PropertyDefinition, PropertyDefinitionTemplate {

	@Indexed
	protected String name;
	protected boolean autoCreated;
	protected boolean mandatory;
	protected int opv;
	protected boolean protectedStatus;

	protected int type;
	protected String[] constraints;
	protected Value[] defaultValues;
	protected boolean multiple;
	private String[] operators;
	private boolean fullTextSearchable;
	private boolean queryOrderable;

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

	public void setRequiredType(int type) {
		this.type = type;

	}

	public void setValueConstraints(String[] constraints) {
		this.constraints = constraints;

	}

	public void setDefaultValues(Value[] defaultValues) {
		this.defaultValues = defaultValues;

	}

	public void setMultiple(boolean multiple) {
		this.mandatory = multiple;

	}

	public void setAvailableQueryOperators(String[] operators) {
		this.operators = operators;

	}

	public void setFullTextSearchable(boolean fullTextSearchable) {
		this.fullTextSearchable = fullTextSearchable;

	}

	public void setQueryOrderable(boolean queryOrderable) {
		this.queryOrderable = queryOrderable;

	}

	public int getRequiredType() {
		return type;
	}

	public String[] getValueConstraints() {
		return constraints;
	}

	public Value[] getDefaultValues() {
		return defaultValues;
	}

	public boolean isMultiple() {
		return multiple;
	}

	public String[] getAvailableQueryOperators() {
		return operators;
	}

	public boolean isFullTextSearchable() {
		return fullTextSearchable;
	}

	public boolean isQueryOrderable() {
		return queryOrderable;
	}

	public NodeType getDeclaringNodeType() {
		return null;
	}

	public String getName() {
		return name;
	}

	public boolean isAutoCreated() {
		return autoCreated;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public int getOnParentVersion() {
		return opv;
	}

	public boolean isProtected() {
		return protectedStatus;
	}

}