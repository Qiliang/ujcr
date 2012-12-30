package com.ujcr.security;

import javax.jcr.AccessDeniedException;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.lock.LockException;
import javax.jcr.security.AccessControlException;
import javax.jcr.security.AccessControlManager;
import javax.jcr.security.AccessControlPolicy;
import javax.jcr.security.AccessControlPolicyIterator;
import javax.jcr.security.Privilege;
import javax.jcr.version.VersionException;

public class AccessControlManagerImpl implements AccessControlManager {

	public Privilege[] getSupportedPrivileges(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Privilege privilegeFromName(String privilegeName) throws AccessControlException, RepositoryException {
		return PrivilegeFactory.getPrivilege(privilegeName);
	}

	public boolean hasPrivileges(String absPath, Privilege[] privileges) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public Privilege[] getPrivileges(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessControlPolicy[] getPolicies(String absPath) throws PathNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessControlPolicy[] getEffectivePolicies(String absPath) throws PathNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessControlPolicyIterator getApplicablePolicies(String absPath) throws PathNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPolicy(String absPath, AccessControlPolicy policy) throws PathNotFoundException, AccessControlException, AccessDeniedException, LockException, VersionException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void removePolicy(String absPath, AccessControlPolicy policy) throws PathNotFoundException, AccessControlException, AccessDeniedException, LockException, VersionException, RepositoryException {
		// TODO Auto-generated method stub

	}
}