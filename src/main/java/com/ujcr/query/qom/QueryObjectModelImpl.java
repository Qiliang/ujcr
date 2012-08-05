package com.ujcr.query.qom;

import javax.jcr.ItemExistsException;
import javax.jcr.ItemNotFoundException;
import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.Value;
import javax.jcr.lock.LockException;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.query.InvalidQueryException;
import javax.jcr.query.QueryResult;
import javax.jcr.query.qom.Column;
import javax.jcr.query.qom.Constraint;
import javax.jcr.query.qom.Ordering;
import javax.jcr.query.qom.QueryObjectModel;
import javax.jcr.query.qom.Source;
import javax.jcr.version.VersionException;

public class QueryObjectModelImpl implements QueryObjectModel {

	public QueryResult execute() throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLimit(long limit) {
		// TODO Auto-generated method stub
		
	}

	public void setOffset(long offset) {
		// TODO Auto-generated method stub
		
	}

	public String getStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLanguage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStoredQueryPath() throws ItemNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node storeAsNode(String absPath) throws ItemExistsException, PathNotFoundException, VersionException, ConstraintViolationException, LockException, UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void bindValue(String varName, Value value) throws IllegalArgumentException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public String[] getBindVariableNames() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Source getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public Constraint getConstraint() {
		// TODO Auto-generated method stub
		return null;
	}

	public Ordering[] getOrderings() {
		// TODO Auto-generated method stub
		return null;
	}

	public Column[] getColumns() {
		// TODO Auto-generated method stub
		return null;
	} }