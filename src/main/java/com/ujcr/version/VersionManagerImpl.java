package com.ujcr.version;

import javax.jcr.AccessDeniedException;
import javax.jcr.InvalidItemStateException;
import javax.jcr.ItemExistsException;
import javax.jcr.MergeException;
import javax.jcr.NoSuchWorkspaceException;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.lock.LockException;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.version.Version;
import javax.jcr.version.VersionException;
import javax.jcr.version.VersionHistory;
import javax.jcr.version.VersionManager;

public class VersionManagerImpl implements VersionManager{

	public Version checkin(String absPath) throws VersionException, UnsupportedRepositoryOperationException, InvalidItemStateException, LockException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void checkout(String absPath) throws UnsupportedRepositoryOperationException, LockException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public Version checkpoint(String absPath) throws VersionException, UnsupportedRepositoryOperationException, InvalidItemStateException, LockException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isCheckedOut(String absPath) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public VersionHistory getVersionHistory(String absPath) throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version getBaseVersion(String absPath) throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void restore(Version[] versions, boolean removeExisting) throws ItemExistsException, UnsupportedRepositoryOperationException, VersionException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void restore(String absPath, String versionName, boolean removeExisting) throws VersionException, ItemExistsException, UnsupportedRepositoryOperationException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void restore(Version version, boolean removeExisting) throws VersionException, ItemExistsException, InvalidItemStateException, UnsupportedRepositoryOperationException, LockException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void restore(String absPath, Version version, boolean removeExisting) throws PathNotFoundException, ItemExistsException, VersionException, ConstraintViolationException, UnsupportedRepositoryOperationException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void restoreByLabel(String absPath, String versionLabel, boolean removeExisting) throws VersionException, ItemExistsException, UnsupportedRepositoryOperationException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public NodeIterator merge(String absPath, String srcWorkspace, boolean bestEffort) throws NoSuchWorkspaceException, AccessDeniedException, MergeException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeIterator merge(String absPath, String srcWorkspace, boolean bestEffort, boolean isShallow) throws NoSuchWorkspaceException, AccessDeniedException, MergeException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void doneMerge(String absPath, Version version) throws VersionException, InvalidItemStateException, UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void cancelMerge(String absPath, Version version) throws VersionException, InvalidItemStateException, UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public Node createConfiguration(String absPath) throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node setActivity(Node activity) throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getActivity() throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node createActivity(String title) throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeActivity(Node activityNode) throws UnsupportedRepositoryOperationException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public NodeIterator merge(Node activityNode) throws VersionException, AccessDeniedException, MergeException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}}