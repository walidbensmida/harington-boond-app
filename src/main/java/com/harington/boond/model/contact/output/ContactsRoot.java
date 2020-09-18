package com.harington.boond.model.contact.output;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactsRoot {

    private ContactMeta meta;
    private List<ContactData> data;
    private List<Object> included;
}
