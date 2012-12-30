package com.ujcr.nodetype;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity(type="DeclaredPropertyDefinition")
class DeclaredPropertyDefinition {
    @StartNode NodeTypeImpl nodeType;
    @EndNode PropertyDefinitionImpl propertyDefinition;
}