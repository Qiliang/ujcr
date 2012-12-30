package com.ujcr;

import javax.jcr.AccessDeniedException;
import javax.jcr.NamespaceException;
import javax.jcr.NamespaceRegistry;
import javax.jcr.RepositoryException;
import javax.jcr.UnsupportedRepositoryOperationException;

public class NamespaceRegistryImpl implements NamespaceRegistry {

	public void registerNamespace(String prefix, String uri) throws NamespaceException, UnsupportedRepositoryOperationException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void unregisterNamespace(String prefix) throws NamespaceException, UnsupportedRepositoryOperationException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public String[] getPrefixes() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getURIs() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getURI(String prefix) throws NamespaceException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrefix(String uri) throws NamespaceException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}}