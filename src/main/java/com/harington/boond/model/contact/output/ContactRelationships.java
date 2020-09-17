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
public class ContactRelationships {

    public ContactMainManager mainManager;
    public ContactAgency agency;
    public List<Object> pole;
    public ContactInfluencers influencers;
    public ContactCompany company;

}
