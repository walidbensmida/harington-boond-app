package com.harington.boond.model.contact.output;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactData {
    private String id;
    private String type;
    private ContactAttributes attributes;
    private ContactRelationships relationships;
}
