package com.harington.boond.model.contact.output;

import lombok.*;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactRelationships {

    private ContactMainManager mainManager;
    private ContactAgency agency;
    private List<Object> pole;
    private ContactInfluencers influencers;
    private ContactCompany company;

}
