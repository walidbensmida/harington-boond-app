package com.harington.boond.model.contact.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactAttributes {
    public String creationDate;
    public String updateDate;
    public int civility;
    public String firstName;
    public String lastName;
    public int state;
    public String email1;
    public String email2;
    public String email3;
    public String phone1;
    public String phone2;
    public String fax;
    public String address;
    public String postcode;
    public String town;
    public String country;
    public ContactOrigin origin;
    public List<Object> activityAreas;
    public String informationComments;
    public List<Object> tools;
    public String department;
    public String function;
    public List<Object> socialNetworks;
}
