package com.harington.boond.model.contact.output;

import com.harington.boond.model.companies.Totals;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactMeta {
    private Totals totals;
    private boolean solr;
    private String version;
    private boolean isLogged;
    private String language;


}
