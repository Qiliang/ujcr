package com.ujcr.security;

import javax.jcr.security.Privilege;

import org.apache.commons.lang3.ArrayUtils;

public class PrivilegeImpl implements Privilege {

	private final String name;

	public PrivilegeImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isAbstract() {
		return false;
	}

	public boolean isAggregate() {
		return false;
	}

	public Privilege[] getDeclaredAggregatePrivileges() {
		return new Privilege[] {};
	}

	public Privilege[] getAggregatePrivileges() {
		return new Privilege[] {};
	}

	public static final Privilege JCR_READ = new PrivilegeImpl(Privilege.JCR_READ);
	public static final Privilege JCR_MODIFY_PROPERTIES = new PrivilegeImpl(Privilege.JCR_MODIFY_PROPERTIES);
	public static final Privilege JCR_ADD_CHILD_NODES = new PrivilegeImpl(Privilege.JCR_ADD_CHILD_NODES);
	public static final Privilege JCR_REMOVE_NODE = new PrivilegeImpl(Privilege.JCR_REMOVE_NODE);
	public static final Privilege JCR_REMOVE_CHILD_NODES = new PrivilegeImpl(Privilege.JCR_REMOVE_CHILD_NODES);
	public static final Privilege JCR_WRITE = new Privilege() {

		@Override
		public boolean isAggregate() {
			return true;
		}

		@Override
		public boolean isAbstract() {
			return false;
		}

		@Override
		public String getName() {
			return JCR_WRITE;
		}

		@Override
		public Privilege[] getDeclaredAggregatePrivileges() {
			return new Privilege[] { PrivilegeImpl.JCR_MODIFY_PROPERTIES, PrivilegeImpl.JCR_ADD_CHILD_NODES, PrivilegeImpl.JCR_REMOVE_NODE, PrivilegeImpl.JCR_REMOVE_CHILD_NODES };
		}

		@Override
		public Privilege[] getAggregatePrivileges() {
			return getDeclaredAggregatePrivileges();

		}
	};
	public static final Privilege JCR_READ_ACCESS_CONTROL = new PrivilegeImpl(Privilege.JCR_READ_ACCESS_CONTROL);
	public static final Privilege JCR_MODIFY_ACCESS_CONTROL = new PrivilegeImpl(Privilege.JCR_MODIFY_ACCESS_CONTROL);
	public static final Privilege JCR_LOCK_MANAGEMENT = new PrivilegeImpl(Privilege.JCR_LOCK_MANAGEMENT);
	public static final Privilege JCR_VERSION_MANAGEMENT = new PrivilegeImpl(Privilege.JCR_VERSION_MANAGEMENT);
	public static final Privilege JCR_NODE_TYPE_MANAGEMENT = new PrivilegeImpl(Privilege.JCR_NODE_TYPE_MANAGEMENT);
	public static final Privilege JCR_RETENTION_MANAGEMENT = new PrivilegeImpl(Privilege.JCR_RETENTION_MANAGEMENT);
	public static final Privilege JCR_LIFECYCLE_MANAGEMENT = new PrivilegeImpl(Privilege.JCR_LIFECYCLE_MANAGEMENT);

	public static final Privilege JCR_ALL = new Privilege() {

		@Override
		public boolean isAggregate() {
			return true;
		}

		@Override
		public boolean isAbstract() {
			return false;
		}

		@Override
		public String getName() {
			return Privilege.JCR_ALL;
		}

		@Override
		public Privilege[] getDeclaredAggregatePrivileges() {
			return new Privilege[] { PrivilegeImpl.JCR_READ, PrivilegeImpl.JCR_WRITE, PrivilegeImpl.JCR_READ_ACCESS_CONTROL, PrivilegeImpl.JCR_MODIFY_ACCESS_CONTROL, PrivilegeImpl.JCR_LOCK_MANAGEMENT, PrivilegeImpl.JCR_VERSION_MANAGEMENT, PrivilegeImpl.JCR_NODE_TYPE_MANAGEMENT, PrivilegeImpl.JCR_RETENTION_MANAGEMENT, PrivilegeImpl.JCR_LIFECYCLE_MANAGEMENT };
		}

		@Override
		public Privilege[] getAggregatePrivileges() {
			return ArrayUtils.addAll(getDeclaredAggregatePrivileges(), PrivilegeImpl.JCR_WRITE.getAggregatePrivileges());
		}
	};

}