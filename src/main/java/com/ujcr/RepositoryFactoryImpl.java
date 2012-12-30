package com.ujcr;

import java.util.Map;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.RepositoryFactory;

import org.neo4j.kernel.AbstractGraphDatabase;

public class RepositoryFactoryImpl implements RepositoryFactory {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Repository getRepository(Map parameters) throws RepositoryException {
		return new RepositoryImpl();
	}
}