package com.ujcr.query;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.query.InvalidQueryException;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;
import javax.jcr.query.qom.QueryObjectModelFactory;

public class QueryManagerImpl implements QueryManager {

	public Query createQuery(String statement, String language) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryObjectModelFactory getQOMFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Query getQuery(Node node) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getSupportedQueryLanguages() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	} }