package com.ujcr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessControlException;

import javax.jcr.AccessDeniedException;
import javax.jcr.Credentials;
import javax.jcr.GuestCredentials;
import javax.jcr.InvalidItemStateException;
import javax.jcr.InvalidSerializedDataException;
import javax.jcr.Item;
import javax.jcr.ItemExistsException;
import javax.jcr.ItemNotFoundException;
import javax.jcr.LoginException;
import javax.jcr.NamespaceException;
import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.Property;
import javax.jcr.ReferentialIntegrityException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.ValueFactory;
import javax.jcr.Workspace;
import javax.jcr.lock.LockException;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.NoSuchNodeTypeException;
import javax.jcr.retention.RetentionManager;
import javax.jcr.security.AccessControlManager;
import javax.jcr.version.VersionException;

import org.neo4j.kernel.AbstractGraphDatabase;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class SessionImpl implements Session {

	private final Repository repository;
	private final String workspaceName;
	private final Credentials credentials;
	
	public SessionImpl(Repository repository, String workspaceName, Credentials credentials) {
		super();
		this.repository = repository;
		this.workspaceName = workspaceName;
		this.credentials = credentials;
	}

	public Repository getRepository() {
		return repository;
	}

	public String getUserID() {
		if (credentials instanceof SimpleCredentials) {
			SimpleCredentials simpleCredentials = (SimpleCredentials) credentials;
			return simpleCredentials.getUserID();

		}else if (credentials instanceof GuestCredentials) {
			return "anonymous user ID";
			
		}
		
		return null;
	}

	public String[] getAttributeNames() {
		if (credentials instanceof SimpleCredentials) {
			SimpleCredentials simpleCredentials = (SimpleCredentials) credentials;
			return simpleCredentials.getAttributeNames();

		}
		return new String[] {};
	}

	public Object getAttribute(String name) {
		if (credentials instanceof SimpleCredentials) {
			SimpleCredentials simpleCredentials = (SimpleCredentials) credentials;
			return simpleCredentials.getAttribute(name);

		}
		return null;
	}

	public Workspace getWorkspace() {
		return new WorkspaceImpl(this, workspaceName, null, null, null, null, null, null);
	}

	public Node getRootNode() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Session impersonate(Credentials credentials) throws LoginException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getNodeByUUID(String uuid) throws ItemNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getNodeByIdentifier(String id) throws ItemNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Item getItem(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getNode(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Property getProperty(String absPath) throws PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean itemExists(String absPath) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean nodeExists(String absPath) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean propertyExists(String absPath) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public void move(String srcAbsPath, String destAbsPath) throws ItemExistsException, PathNotFoundException, VersionException, ConstraintViolationException, LockException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void removeItem(String absPath) throws VersionException, LockException, ConstraintViolationException, AccessDeniedException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void save() throws AccessDeniedException, ItemExistsException, ReferentialIntegrityException, ConstraintViolationException, InvalidItemStateException, VersionException, LockException, NoSuchNodeTypeException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void refresh(boolean keepChanges) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	public boolean hasPendingChanges() throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public ValueFactory getValueFactory() throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasPermission(String absPath, String actions) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public void checkPermission(String absPath, String actions) throws AccessControlException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public boolean hasCapability(String methodName, Object target, Object[] arguments) throws RepositoryException {
		// TODO Auto-generated method stub
		return false;
	}

	public ContentHandler getImportContentHandler(String parentAbsPath, int uuidBehavior) throws PathNotFoundException, ConstraintViolationException, VersionException, LockException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void importXML(String parentAbsPath, InputStream in, int uuidBehavior) throws IOException, PathNotFoundException, ItemExistsException, ConstraintViolationException, VersionException, InvalidSerializedDataException, LockException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void exportSystemView(String absPath, ContentHandler contentHandler, boolean skipBinary, boolean noRecurse) throws PathNotFoundException, SAXException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void exportSystemView(String absPath, OutputStream out, boolean skipBinary, boolean noRecurse) throws IOException, PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void exportDocumentView(String absPath, ContentHandler contentHandler, boolean skipBinary, boolean noRecurse) throws PathNotFoundException, SAXException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void exportDocumentView(String absPath, OutputStream out, boolean skipBinary, boolean noRecurse) throws IOException, PathNotFoundException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public void setNamespacePrefix(String prefix, String uri) throws NamespaceException, RepositoryException {
		// TODO Auto-generated method stub

	}

	public String[] getNamespacePrefixes() throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNamespaceURI(String prefix) throws NamespaceException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNamespacePrefix(String uri) throws NamespaceException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public void logout() {
		// TODO Auto-generated method stub

	}

	public boolean isLive() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addLockToken(String lt) {
		// TODO Auto-generated method stub

	}

	public String[] getLockTokens() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeLockToken(String lt) {
		// TODO Auto-generated method stub

	}

	public AccessControlManager getAccessControlManager() throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public RetentionManager getRetentionManager() throws UnsupportedRepositoryOperationException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}
}