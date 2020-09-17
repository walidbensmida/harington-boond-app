package com.harington.boond.model.contact.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactData {
    public String id;
    public String type;
    public ContactAttributes attributes;
    public ContactRelationships relationships;
}
