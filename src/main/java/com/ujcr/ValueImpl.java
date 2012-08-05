package com.ujcr;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.jcr.Binary;
import javax.jcr.RepositoryException;
import javax.jcr.Value;
import javax.jcr.ValueFormatException;

public class ValueImpl implements Value{

	public String getString() throws ValueFormatException, IllegalStateException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getStream() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Binary getBinary() throws RepositoryException {
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

	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}}