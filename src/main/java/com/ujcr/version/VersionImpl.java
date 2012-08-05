package com.ujcr.version;

import java.util.Calendar;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.version.Version;
import javax.jcr.version.VersionHistory;

import com.ujcr.NodeImpl;

public class VersionImpl extends NodeImpl implements Version{

	public VersionHistory getContainingHistory() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Calendar getCreated() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version getLinearSuccessor() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version[] getSuccessors() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version getLinearPredecessor() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Version[] getPredecessors() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getFrozenNode() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}}