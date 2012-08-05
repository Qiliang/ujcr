package com.ujcr.lock;

import javax.jcr.AccessDeniedException;
import javax.jcr.InvalidItemStateException;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.lock.Lock;
import javax.jcr.lock.LockException;
import javax.jcr.lock.LockManager;

public class LockManagerImpl implements LockManager{

	public void addLockToken(String lockToken) throws LockException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public Lock getLock(String absPath) throws PathNotFoundException, LockException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getLockTokens() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean holdsLock(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public Lock lock(String absPath, boolean isDeep, boolean isSessionScoped, long timeoutHint, String ownerInfo) throws LockException, PathNotFoundException, AccessDeniedException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isLocked(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeLockToken(String lockToken) throws LockException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void unlock(String absPath) throws PathNotFoundException, LockException, AccessDeniedException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		
	}}