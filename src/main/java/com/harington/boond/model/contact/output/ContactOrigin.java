package com.harington.boond.model.contact.output;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactOrigin {
    private int typeOf;
    private String detail;
}
