package com.harington.boond.model.companies;

public class Relationships {

    public MainManager mainManager;
    public Agency agency;

    public Relationships() {
    }

    public Relationships(MainManager mainManager, Agency agency) {
        this.mainManager = mainManager;
        this.agency = agency;
    }

    public MainManager getMainManager() {
        return mainManager;
    }

    public void setMainManager(MainManager mainManager) {
        this.mainManager = mainManager;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }
}
