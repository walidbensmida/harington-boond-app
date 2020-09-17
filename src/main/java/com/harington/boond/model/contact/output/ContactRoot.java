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
public class ContactRoot {

    public ContactMeta meta;
    public ContactData data;
    public List<Object> included;
}
