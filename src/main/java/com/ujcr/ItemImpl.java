package com.ujcr;

import javax.jcr.AccessDeniedException;
import javax.jcr.InvalidItemStateException;
import javax.jcr.Item;
import javax.jcr.ItemExistsException;
import javax.jcr.ItemNotFoundException;
import javax.jcr.ItemVisitor;
import javax.jcr.Node;
import javax.jcr.ReferentialIntegrityException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.lock.LockException;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.NoSuchNodeTypeException;
import javax.jcr.version.VersionException;

public class ItemImpl implements Item{

	public String getPath() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Item getAncestor(int depth) throws ItemNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getParent() throws ItemNotFoundException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getDepth() throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Session getSession() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isNode() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSame(Item otherItem) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public void accept(ItemVisitor visitor) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void save() throws AccessDeniedException, ItemExistsException, ConstraintViolationException, InvalidItemStateException, ReferentialIntegrityException, VersionException, LockException, NoSuchNodeTypeException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void refresh(boolean keepChanges) throws InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void remove() throws VersionException, LockException, ConstraintViolationException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		
	}}