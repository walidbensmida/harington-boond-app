package com.harington.boond.model.companies;

public class Attributes {
    public String name;
    public String expertiseArea;
    public int state;
    public String informationComments;
    public String website;
    public String phone1;
    public String town;
    public String country;


    public Attributes() {
    }

    public Attributes(String name, String expertiseArea, int state, String informationComments, String website, String phone1, String town, String country) {
        this.name = name;
        this.expertiseArea = expertiseArea;
        this.state = state;
        this.informationComments = informationComments;
        this.website = website;
        this.phone1 = phone1;
        this.town = town;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getInformationComments() {
        return informationComments;
    }

    public void setInformationComments(String informationComments) {
        this.informationComments = informationComments;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
