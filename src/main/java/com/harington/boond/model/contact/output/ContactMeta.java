package com.harington.boond.model.contact.output;

import com.harington.boond.model.companies.Totals;

public class ContactMeta {
    public Totals totals;
    public boolean solr;
    public String version;
    public boolean isLogged;
    public String language;

    public ContactMeta() {
    }

    public ContactMeta(Totals totals, boolean solr, String version, boolean isLogged, String language) {
        this.totals = totals;
        this.solr = solr;
        this.version = version;
        this.isLogged = isLogged;
        this.language = language;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public boolean isSolr() {
        return solr;
    }

    public void setSolr(boolean solr) {
        this.solr = solr;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
