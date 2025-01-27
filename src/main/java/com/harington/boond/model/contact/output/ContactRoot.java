package com.harington.boond.model.contact.output;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactRoot {

    private ContactMeta meta;
    private ContactData data;
    private List<Object> included;
}
