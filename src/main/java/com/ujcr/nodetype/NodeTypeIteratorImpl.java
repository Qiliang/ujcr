package com.ujcr.nodetype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeIterator;

public class NodeTypeIteratorImpl implements NodeTypeIterator {

	private final List<NodeType> nodeTypes = new ArrayList<NodeType>();
	private int position = 0;

	public NodeTypeIteratorImpl(Iterator<NodeTypeImpl> iterator) {
		while (iterator.hasNext()) {
			NodeType nodeTypeImpl = (NodeType) iterator.next();
			nodeTypes.add(nodeTypeImpl);
		}
	}

	public void skip(long skipNum) {
		position += skipNum;
	}

	public long getSize() {
		return nodeTypes.size();
	}

	public long getPosition() {
		return position;
	}

	public boolean hasNext() {
		return position >= nodeTypes.size();
	}

	public Object next() {
		return nodeTypes.get(position++);
	}

	public void remove() {
		throw new UnsupportedOperationException ();

	}

	public NodeType nextNodeType() {
		return  nodeTypes.get(position++);
	}
}