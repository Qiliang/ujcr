package com.ujcr;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.jcr.Binary;
import javax.jcr.ItemNotFoundException;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.RepositoryException;
import javax.jcr.Value;
import javax.jcr.ValueFormatException;
import javax.jcr.lock.LockException;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.PropertyDefinition;
import javax.jcr.version.VersionException;

public class PropertyImpl extends ItemImpl implements Property{

	public void setValue(Value value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(Value[] values) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(String value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(String[] values) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(InputStream value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(Binary value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(long value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(double value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(BigDecimal value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(Calendar value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(boolean value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(Node value) throws ValueFormatException, VersionException, LockException, ConstraintViolationException, RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public Value getValue() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Value[] getValues() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getString() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getStream() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Binary getBinary() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public long getLong() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDouble() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public BigDecimal getDecimal() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Calendar getDate() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getBoolean() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public Node getNode() throws ItemNotFoundException, ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Property getProperty() throws ItemNotFoundException, ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public long getLength() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public long[] getLengths() throws ValueFormatException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public PropertyDefinition getDefinition() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getType() throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isMultiple() throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}}