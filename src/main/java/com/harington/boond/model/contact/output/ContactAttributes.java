package com.harington.boond.model.contact.output;

import lombok.*;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactAttributes {
    private String creationDate;
    private String updateDate;
    private int civility;
    private String firstName;
    private String lastName;
    private int state;
    private String email1;
    private String email2;
    private String email3;
    private String phone1;
    private String phone2;
    private String fax;
    private String address;
    private String postcode;
    private String town;
    private String country;
    private ContactOrigin origin;
    private List<Object> activityAreas;
    private String informationComments;
    private List<Object> tools;
    private String department;
    private String function;
    private List<Object> socialNetworks;
}
