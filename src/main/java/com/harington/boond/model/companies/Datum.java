package com.harington.boond.model.companies;

public class Datum {
    public String id;
    public String type;
    public Attributes attributes;
    public Relationships relationships;

    public Datum() {
    }

    public Datum(String id, String type, Attributes attributes, Relationships relationships) {
        this.id = id;
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }
}
