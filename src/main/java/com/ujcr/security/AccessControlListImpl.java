package com.ujcr.security;

import java.security.Principal;

import javax.jcr.RepositoryException;
import javax.jcr.security.AccessControlEntry;
import javax.jcr.security.AccessControlException;
import javax.jcr.security.AccessControlList;
import javax.jcr.security.Privilege;

public class AccessControlListImpl implements AccessControlList{

	public AccessControlEntry[] getAccessControlEntries() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addAccessControlEntry(Principal principal, Privilege[] privileges) throws AccessControlException, RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeAccessControlEntry(AccessControlEntry ace) throws AccessControlException, RepositoryException {
		// TODO Auto-generated method stub
		
	}}