package com.harington.boond.model.companies;

public class Included {
    public String id;
    public String type;
    public Attributes2 attributes;

    public Included() {
    }

    public Included(String id, String type, Attributes2 attributes) {
        this.id = id;
        this.type = type;
        this.attributes = attributes;
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

    public Attributes2 getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes2 attributes) {
        this.attributes = attributes;
    }
}
