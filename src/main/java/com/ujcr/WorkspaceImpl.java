package com.ujcr;

import java.io.IOException;
import java.io.InputStream;

import javax.jcr.AccessDeniedException;
import javax.jcr.InvalidItemStateException;
import javax.jcr.InvalidSerializedDataException;
import javax.jcr.ItemExistsException;
import javax.jcr.NamespaceRegistry;
import javax.jcr.NoSuchWorkspaceException;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.Workspace;
import javax.jcr.lock.LockException;
import javax.jcr.lock.LockManager;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.NodeTypeManager;
import javax.jcr.observation.ObservationManager;
import javax.jcr.query.QueryManager;
import javax.jcr.version.Version;
import javax.jcr.version.VersionException;
import javax.jcr.version.VersionManager;

import org.xml.sax.ContentHandler;

public class WorkspaceImpl implements Workspace {

	public final static String DEFUALT_NAME = "public";

	private final Session session;
	private final String name;
	private final LockManager lockManager;
	private final QueryManager queryManager;
	private final NamespaceRegistry namespaceRegistry;
	private final NodeTypeManager nodeTypeManager;
	private final ObservationManager observationManager;
	private final VersionManager versionManager;

	public WorkspaceImpl(Session session, String name, LockManager lockManager, QueryManager queryManager, NamespaceRegistry namespaceRegistry, NodeTypeManager nodeTypeManager, ObservationManager observationManager, VersionManager versionManager) {
		this.session = session;
		this.name = name;
		this.lockManager = lockManager;
		this.queryManager = queryManager;
		this.namespaceRegistry = namespaceRegistry;
		this.nodeTypeManager = nodeTypeManager;
		this.observationManager = observationManager;
		this.versionManager = versionManager;
	}

	public Session getSession() {
		return session;
	}

	public String getName() {
		return name;
	}

	public void copy(String srcAbsPath, String destAbsPath) throws ConstraintViolationException, VersionException, AccessDeniedException, PathNotFoundException, ItemExistsException, LockException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void copy(String srcWorkspace, String srcAbsPath, String destAbsPath) throws NoSuchWorkspaceException, ConstraintViolationException, VersionException, AccessDeniedException, PathNotFoundException, ItemExistsException, LockException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void clone(String srcWorkspace, String srcAbsPath, String destAbsPath, boolean removeExisting) throws NoSuchWorkspaceException, ConstraintViolationException, VersionException, AccessDeniedException, PathNotFoundException, ItemExistsException, LockException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void move(String srcAbsPath, String destAbsPath) throws ConstraintViolationException, VersionException, AccessDeniedException, PathNotFoundException, ItemExistsException, LockException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void restore(Version[] versions, boolean removeExisting) throws ItemExistsException, UnsupportedRepositoryOperationException, VersionException, LockException, InvalidItemStateException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public LockManager getLockManager() throws UnsupportedRepositoryOperationException, RepositoryException {
		return lockManager;
	}

	public QueryManager getQueryManager() throws RepositoryException {
		return queryManager;
	}

	public NamespaceRegistry getNamespaceRegistry() throws RepositoryException {
		return namespaceRegistry;
	}

	public NodeTypeManager getNodeTypeManager() throws RepositoryException {
		return nodeTypeManager;
	}

	public ObservationManager getObservationManager() throws UnsupportedRepositoryOperationException, RepositoryException {
		return observationManager;
	}

	public VersionManager getVersionManager() throws UnsupportedRepositoryOperationException, RepositoryException {
		return versionManager;
	}

	public String[] getAccessibleWorkspaceNames() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public ContentHandler getImportContentHandler(String parentAbsPath, int uuidBehavior) throws PathNotFoundException, ConstraintViolationException, VersionException, LockException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void importXML(String parentAbsPath, InputStream in, int uuidBehavior) throws IOException, VersionException, PathNotFoundException, ItemExistsException, ConstraintViolationException, InvalidSerializedDataException, LockException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void createWorkspace(String name) throws AccessDeniedException, UnsupportedRepositoryOperationException, RepositoryException {
		//Http.put("/" + name);

	}

	public void createWorkspace(String name, String srcWorkspace) throws AccessDeniedException, UnsupportedRepositoryOperationException, NoSuchWorkspaceException, RepositoryException {
		// TODO Auto-generated method stub
	}

	public void deleteWorkspace(String name) throws AccessDeniedException, UnsupportedRepositoryOperationException, NoSuchWorkspaceException, RepositoryException {
		//Http.delete("/" + name);

	}
}