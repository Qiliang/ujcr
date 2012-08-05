package com.ujcr.query.qom;

import javax.jcr.RepositoryException;
import javax.jcr.Value;
import javax.jcr.query.InvalidQueryException;
import javax.jcr.query.qom.And;
import javax.jcr.query.qom.BindVariableValue;
import javax.jcr.query.qom.ChildNode;
import javax.jcr.query.qom.ChildNodeJoinCondition;
import javax.jcr.query.qom.Column;
import javax.jcr.query.qom.Comparison;
import javax.jcr.query.qom.Constraint;
import javax.jcr.query.qom.DescendantNode;
import javax.jcr.query.qom.DescendantNodeJoinCondition;
import javax.jcr.query.qom.DynamicOperand;
import javax.jcr.query.qom.EquiJoinCondition;
import javax.jcr.query.qom.FullTextSearch;
import javax.jcr.query.qom.FullTextSearchScore;
import javax.jcr.query.qom.Join;
import javax.jcr.query.qom.JoinCondition;
import javax.jcr.query.qom.Length;
import javax.jcr.query.qom.Literal;
import javax.jcr.query.qom.LowerCase;
import javax.jcr.query.qom.NodeLocalName;
import javax.jcr.query.qom.NodeName;
import javax.jcr.query.qom.Not;
import javax.jcr.query.qom.Or;
import javax.jcr.query.qom.Ordering;
import javax.jcr.query.qom.PropertyExistence;
import javax.jcr.query.qom.PropertyValue;
import javax.jcr.query.qom.QueryObjectModel;
import javax.jcr.query.qom.QueryObjectModelFactory;
import javax.jcr.query.qom.SameNode;
import javax.jcr.query.qom.SameNodeJoinCondition;
import javax.jcr.query.qom.Selector;
import javax.jcr.query.qom.Source;
import javax.jcr.query.qom.StaticOperand;
import javax.jcr.query.qom.UpperCase;

public class QueryObjectModelFactoryImpl implements QueryObjectModelFactory {

	public QueryObjectModel createQuery(Source source, Constraint constraint, Ordering[] orderings, Column[] columns) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Selector selector(String nodeTypeName, String selectorName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Join join(Source left, Source right, String joinType, JoinCondition joinCondition) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public EquiJoinCondition equiJoinCondition(String selector1Name, String property1Name, String selector2Name, String property2Name) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public SameNodeJoinCondition sameNodeJoinCondition(String selector1Name, String selector2Name, String selector2Path) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public ChildNodeJoinCondition childNodeJoinCondition(String childSelectorName, String parentSelectorName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public DescendantNodeJoinCondition descendantNodeJoinCondition(String descendantSelectorName, String ancestorSelectorName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public And and(Constraint constraint1, Constraint constraint2) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Or or(Constraint constraint1, Constraint constraint2) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Not not(Constraint constraint) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparison comparison(DynamicOperand operand1, String operator, StaticOperand operand2) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public PropertyExistence propertyExistence(String selectorName, String propertyName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public FullTextSearch fullTextSearch(String selectorName, String propertyName, StaticOperand fullTextSearchExpression) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public SameNode sameNode(String selectorName, String path) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public ChildNode childNode(String selectorName, String path) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public DescendantNode descendantNode(String selectorName, String path) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public PropertyValue propertyValue(String selectorName, String propertyName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Length length(PropertyValue propertyValue) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeName nodeName(String selectorName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public NodeLocalName nodeLocalName(String selectorName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public FullTextSearchScore fullTextSearchScore(String selectorName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public LowerCase lowerCase(DynamicOperand operand) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public UpperCase upperCase(DynamicOperand operand) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public BindVariableValue bindVariable(String bindVariableName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Literal literal(Value literalValue) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Ordering ascending(DynamicOperand operand) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Ordering descending(DynamicOperand operand) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Column column(String selectorName, String propertyName, String columnName) throws InvalidQueryException, RepositoryException {
		// TODO Auto-generated method stub
		return null;
	} }