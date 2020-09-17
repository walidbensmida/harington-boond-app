package com.harington.boond.model.companies;

import java.util.List;

public class CompaniesRoot {
    public Meta meta;
    public List<Datum> data;
    public List<Included> included;

    public CompaniesRoot() {
    }

    public CompaniesRoot(Meta meta, List<Datum> data, List<Included> included) {
        this.meta = meta;
        this.data = data;
        this.included = included;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public List<Included> getIncluded() {
        return included;
    }

    public void setIncluded(List<Included> included) {
        this.included = included;
    }

    @Override
    public String toString() {
        return "CompaniesRoot{" +
                "meta=" + meta +
                ", data=" + data +
                ", included=" + included +
                '}';
    }
}
