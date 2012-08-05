package com.ujcr.observation;

import javax.jcr.RepositoryException;
import javax.jcr.observation.EventJournal;
import javax.jcr.observation.EventListener;
import javax.jcr.observation.EventListenerIterator;
import javax.jcr.observation.ObservationManager;

public class ObservationManagerImpl implements ObservationManager{

	public void addEventListener(EventListener listener, int eventTypes, String absPath, boolean isDeep, String[] uuid, String[] nodeTypeName, boolean noLocal) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public void removeEventListener(EventListener listener) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public EventListenerIterator getRegisteredEventListeners() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserData(String userData) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	public EventJournal getEventJournal() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public EventJournal getEventJournal(int eventTypes, String absPath, boolean isDeep, String[] uuid, String[] nodeTypeName) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}}