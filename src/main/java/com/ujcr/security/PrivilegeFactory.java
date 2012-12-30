package com.ujcr.security;

import javax.jcr.security.Privilege;

public final class PrivilegeFactory {

	public static Privilege getPrivilege(String privilegeName) {
		if (Privilege.JCR_ALL.equals(privilegeName))
			return PrivilegeImpl.JCR_ALL;
		else if (Privilege.JCR_WRITE.equals(privilegeName))
			return PrivilegeImpl.JCR_WRITE;
		else if (Privilege.JCR_READ.equals(privilegeName))
			return PrivilegeImpl.JCR_READ;
		else if (Privilege.JCR_MODIFY_PROPERTIES.equals(privilegeName))
			return PrivilegeImpl.JCR_MODIFY_PROPERTIES;
		else if (Privilege.JCR_ADD_CHILD_NODES.equals(privilegeName))
			return PrivilegeImpl.JCR_ADD_CHILD_NODES;
		else if (Privilege.JCR_REMOVE_NODE.equals(privilegeName))
			return PrivilegeImpl.JCR_REMOVE_NODE;
		else if (Privilege.JCR_REMOVE_CHILD_NODES.equals(privilegeName))
			return PrivilegeImpl.JCR_REMOVE_CHILD_NODES;
		else if (Privilege.JCR_READ_ACCESS_CONTROL.equals(privilegeName))
			return PrivilegeImpl.JCR_READ_ACCESS_CONTROL;
		else if (Privilege.JCR_MODIFY_ACCESS_CONTROL.equals(privilegeName))
			return PrivilegeImpl.JCR_MODIFY_ACCESS_CONTROL;
		else if (Privilege.JCR_LOCK_MANAGEMENT.equals(privilegeName))
			return PrivilegeImpl.JCR_LOCK_MANAGEMENT;
		else if (Privilege.JCR_VERSION_MANAGEMENT.equals(privilegeName))
			return PrivilegeImpl.JCR_VERSION_MANAGEMENT;
		else if (Privilege.JCR_NODE_TYPE_MANAGEMENT.equals(privilegeName))
			return PrivilegeImpl.JCR_NODE_TYPE_MANAGEMENT;
		else if (Privilege.JCR_RETENTION_MANAGEMENT.equals(privilegeName))
			return PrivilegeImpl.JCR_RETENTION_MANAGEMENT;
		else if (Privilege.JCR_LIFECYCLE_MANAGEMENT.equals(privilegeName))
			return PrivilegeImpl.JCR_LIFECYCLE_MANAGEMENT;
		return null;
	}

}
