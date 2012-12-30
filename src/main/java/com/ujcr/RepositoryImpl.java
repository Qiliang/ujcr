package com.ujcr;

import java.util.HashMap;
import java.util.Map;

import javax.jcr.Credentials;
import javax.jcr.GuestCredentials;
import javax.jcr.LoginException;
import javax.jcr.NoSuchWorkspaceException;
import javax.jcr.PropertyType;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.Value;
import javax.jcr.ValueFactory;

import org.apache.commons.lang3.StringUtils;
import org.neo4j.kernel.AbstractGraphDatabase;

public class RepositoryImpl implements Repository {

	private final Map<String,Object> descriptor=new HashMap<String, Object>();
	private final ValueFactory vf=new ValueFactoryImpl();
	
	public RepositoryImpl(){
		descriptor.put(SPEC_VERSION_DESC,vf.createValue("2.0"));
		descriptor.put(SPEC_NAME_DESC,vf.createValue("Content Repository for Java Technology API"));
		
		descriptor.put(REP_VENDOR_DESC,vf.createValue("XQL"));
		descriptor.put(REP_VENDOR_URL_DESC,vf.createValue("www.XQL.com"));
		descriptor.put(REP_NAME_DESC,vf.createValue("ujcr"));
		descriptor.put(REP_VERSION_DESC,vf.createValue("0.2"));
		
		descriptor.put(WRITE_SUPPORTED,vf.createValue(true));
		descriptor.put(IDENTIFIER_STABILITY,vf.createValue(IDENTIFIER_STABILITY_INDEFINITE_DURATION));
		//��֧��xml����
		descriptor.put(OPTION_XML_EXPORT_SUPPORTED,vf.createValue(false));
		//��֧��xml����
		descriptor.put(OPTION_XML_IMPORT_SUPPORTED,vf.createValue(false));
		//֧�ַ��ļ�����
		descriptor.put(OPTION_UNFILED_CONTENT_SUPPORTED,vf.createValue(true));
		//�汾֧��		
		descriptor.put(OPTION_VERSIONING_SUPPORTED,vf.createValue(true));
		//��֧�ּ򵥰汾
		descriptor.put(OPTION_SIMPLE_VERSIONING_SUPPORTED,vf.createValue(true));
		//��֧��activities
		descriptor.put(OPTION_ACTIVITIES_SUPPORTED,vf.createValue(false));
		//��֧�ֻ���
		descriptor.put(OPTION_BASELINES_SUPPORTED,vf.createValue(true));
		//֧��acl
		descriptor.put(OPTION_ACCESS_CONTROL_SUPPORTED,vf.createValue(true));
		//֧����
		descriptor.put(OPTION_LOCKING_SUPPORTED,vf.createValue(true));
		//��֧���첽�¼�
		descriptor.put(OPTION_OBSERVATION_SUPPORTED,vf.createValue(true));
		//֧����־�¼�
		descriptor.put(OPTION_JOURNALED_OBSERVATION_SUPPORTED,vf.createValue(true));
		//��֧�ָ���
		descriptor.put(OPTION_RETENTION_SUPPORTED,vf.createValue(false));
		//��֧����������
		descriptor.put(OPTION_LIFECYCLE_SUPPORTED,vf.createValue(false));
		//֧������
		descriptor.put(OPTION_TRANSACTIONS_SUPPORTED,vf.createValue(true));
		//֧��workspace����
		descriptor.put(OPTION_WORKSPACE_MANAGEMENT_SUPPORTED,vf.createValue(true));
		//��֧�ָ���primary_node_type
		descriptor.put(OPTION_UPDATE_PRIMARY_NODE_TYPE_SUPPORTED,vf.createValue(false));
		//��֧�ָ���mixin_node_types
		descriptor.put(OPTION_UPDATE_MIXIN_NODE_TYPES_SUPPORTED,vf.createValue(false));
		//��֧��shareable_nodes
		descriptor.put(OPTION_SHAREABLE_NODES_SUPPORTED,vf.createValue(false));
		//֧��node_type����
		descriptor.put(OPTION_NODE_TYPE_MANAGEMENT_SUPPORTED,vf.createValue(true));
		//��֧��node��property�����ظ�
		descriptor.put(OPTION_NODE_AND_PROPERTY_WITH_SAME_NAME_SUPPORTED,vf.createValue(false));
		//node_Typeֻ�̳�nt:base
		descriptor.put(NODE_TYPE_MANAGEMENT_INHERITANCE,vf.createValue(NODE_TYPE_MANAGEMENT_INHERITANCE_MINIMAL));
		//��֧��overraid����
		descriptor.put(NODE_TYPE_MANAGEMENT_OVERRIDES_SUPPORTED,vf.createValue(false));
		//֧��primary_item
		descriptor.put(NODE_TYPE_MANAGEMENT_PRIMARY_ITEM_NAME_SUPPORTED,vf.createValue(true));
		//֧��node����
		descriptor.put(NODE_TYPE_MANAGEMENT_ORDERABLE_CHILD_NODES_SUPPORTED,vf.createValue(true));
		//��֧��RESIDUA
		descriptor.put(NODE_TYPE_MANAGEMENT_RESIDUAL_DEFINITIONS_SUPPORTED,vf.createValue(false));
		//֧���Զ���������
		descriptor.put(NODE_TYPE_MANAGEMENT_AUTOCREATED_DEFINITIONS_SUPPORTED,vf.createValue(true));
		//��֧��ͬ�����ھӽڵ�
		descriptor.put(NODE_TYPE_MANAGEMENT_SAME_NAME_SIBLINGS_SUPPORTED,vf.createValue(false));
		
		descriptor.put(NODE_TYPE_MANAGEMENT_PROPERTY_TYPES,getPropertyTypes());
		//֧�ֶ�ֵ����
		descriptor.put(NODE_TYPE_MANAGEMENT_MULTIVALUED_PROPERTIES_SUPPORTED,vf.createValue(true));
		//֧�ֶ��������
		descriptor.put(NODE_TYPE_MANAGEMENT_MULTIPLE_BINARY_PROPERTIES_SUPPORTED,vf.createValue(true));
		//֧�ֳ�������
		descriptor.put(NODE_TYPE_MANAGEMENT_VALUE_CONSTRAINTS_SUPPORTED,vf.createValue(true));
		//��֧��node_typeʹ���и���
		descriptor.put(NODE_TYPE_MANAGEMENT_UPDATE_IN_USE_SUPORTED,vf.createValue(true));
		
		//֧�ֵĲ�ѯ����
		descriptor.put(QUERY_LANGUAGES,vf.createValue(true));
		//֧�ֱ����ѯ���
		descriptor.put(QUERY_STORED_QUERIES_SUPPORTED,vf.createValue(true));
		//֧��ȫ������
		descriptor.put(QUERY_FULL_TEXT_SEARCH_SUPPORTED,vf.createValue(true));
		//��֧��join��ѯ
		descriptor.put(QUERY_JOINS,vf.createValue(QUERY_JOINS_NONE));
	}
	
	private Value[] getPropertyTypes(){
		return new Value[]{vf.createValue(PropertyType.UNDEFINED),
				vf.createValue(PropertyType.UNDEFINED),
				vf.createValue(PropertyType.BINARY),
				vf.createValue(PropertyType.BOOLEAN),
				vf.createValue(PropertyType.DATE),
				vf.createValue(PropertyType.DECIMAL),
				vf.createValue(PropertyType.DOUBLE),
				vf.createValue(PropertyType.LONG),
				vf.createValue(PropertyType.NAME),
				vf.createValue(PropertyType.PATH),
				vf.createValue(PropertyType.REFERENCE),
				vf.createValue(PropertyType.STRING),
				vf.createValue(PropertyType.URI),
				vf.createValue(PropertyType.WEAKREFERENCE),
		};
	}
	
	
	public String[] getDescriptorKeys() {
		return descriptor.keySet().toArray(new String[]{});
	}

	public boolean isStandardDescriptor(String key) {
		return true;
	}

	public boolean isSingleValueDescriptor(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public Value getDescriptorValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Value[] getDescriptorValues(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescriptor(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	private void checkSimpleCredentials(SimpleCredentials simpleCredentials) throws LoginException {

	}

	public Session login(Credentials credentials, String workspaceName) throws LoginException, NoSuchWorkspaceException, RepositoryException {
		if (StringUtils.isBlank(workspaceName)) {
			workspaceName = WorkspaceImpl.DEFUALT_NAME;
		}

		if (credentials == null) {
			credentials = new GuestCredentials();
		}

		if (credentials instanceof SimpleCredentials) {
			SimpleCredentials simpleCredentials = (SimpleCredentials) credentials;
			checkSimpleCredentials(simpleCredentials);
		}


		return new SessionImpl(this, workspaceName, credentials);
	}

	public Session login(Credentials credentials) throws LoginException, RepositoryException {
		return login(credentials, null);
	}

	public Session login(String workspaceName) throws LoginException, NoSuchWorkspaceException, RepositoryException {
		return login(null, workspaceName);
	}

	public Session login() throws LoginException, RepositoryException {
		return login(null, null);
	}
}