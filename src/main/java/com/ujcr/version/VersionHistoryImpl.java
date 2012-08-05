package com.ujcr.version;

import javax.jcr.AccessDeniedException;
import javax.jcr.NodeIterator;
import javax.jcr.ReferentialIntegrityException;
import javax.jcr.RepositoryException;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.version.LabelExistsVersionException;
import javax.jcr.version.Version;
import javax.jcr.version.VersionException;
import javax.jcr.version.VersionHistory;
import javax.jcr.version.VersionIterator;

import com.ujcr.NodeImpl;

public class VersionHistoryImpl extends NodeImpl implements VersionHistory{

	public String getVersionableUUID() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVersionableIdentifier() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version getRootVersion() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public VersionIterator getAllLinearVersions() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public VersionIterator getAllVersions() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeIterator getAllLinearFrozenNodes() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeIterator getAllFrozenNodes() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version getVersion(String versionName) throws VersionException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version getVersionByLabel(String label) throws VersionException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addVersionLabel(String versionName, String label, boolean moveLabel) throws LabelExistsVersionException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void removeVersionLabel(String label) throws VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public boolean hasVersionLabel(String label) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasVersionLabel(Version version, String label) throws VersionException, RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public String[] getVersionLabels() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getVersionLabels(Version version) throws VersionException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeVersion(String versionName) throws ReferentialIntegrityException, AccessDeniedException, UnsupportedRepositoryOperationException, VersionException, RepositoryException {
		// TODO Auto-generated method stub
		
	}}