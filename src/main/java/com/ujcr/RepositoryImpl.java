package com.ujcr;

import javax.jcr.Credentials;
import javax.jcr.LoginException;
import javax.jcr.NoSuchWorkspaceException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.Value;

public class RepositoryImpl implements Repository{

	public String[] getDescriptorKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isStandardDescriptor(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSingleValueDescriptor(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public Value getDescriptorValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Value[] getDescriptorValues(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescriptor(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Session login(Credentials credentials, String workspaceName) throws LoginException, NoSuchWorkspaceException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Session login(Credentials credentials) throws LoginException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Session login(String workspaceName) throws LoginException, NoSuchWorkspaceException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Session login() throws LoginException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}}