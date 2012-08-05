package com.ujcr.retention;

import javax.jcr.AccessDeniedException;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.lock.LockException;
import javax.jcr.retention.Hold;
import javax.jcr.retention.RetentionManager;
import javax.jcr.retention.RetentionPolicy;
import javax.jcr.version.VersionException;

public class RetentionManagerImpl implements RetentionManager{

	public Hold[] getHolds(String absPath) throws PathNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Hold addHold(String absPath, String name, boolean isDeep) throws PathNotFoundException, AccessDeniedException, LockException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeHold(String absPath, Hold hold) throws PathNotFoundException, AccessDeniedException, LockException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public RetentionPolicy getRetentionPolicy(String absPath) throws PathNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRetentionPolicy(String absPath, RetentionPolicy retentionPolicy) throws PathNotFoundException, AccessDeniedException, LockException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void removeRetentionPolicy(String absPath) throws PathNotFoundException, AccessDeniedException, LockException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}}