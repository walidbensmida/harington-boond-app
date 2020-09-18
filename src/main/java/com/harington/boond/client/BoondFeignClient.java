package com.harington.boond.client;
import com.harington.boond.model.companies.CompaniesRoot;
import com.harington.boond.model.contact.output.ContactRoot;
import com.harington.boond.model.contact.output.ContactsRoot;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping("/api")
@FeignClient(name="boondclient",url = "${boond.api.url}",configuration = FeignClientsConfiguration.class)
public interface BoondFeignClient {

    @GetMapping(produces = APPLICATION_JSON_VALUE, path = "/companies")
    CompaniesRoot getAllCompanies() ;

    @GetMapping(produces = APPLICATION_JSON_VALUE, path = "/companies/{id}/contacts")
    ContactsRoot getContactsForCompany(@PathVariable("id") Long id) ;


    @GetMapping(produces = APPLICATION_JSON_VALUE, path = "/contacts/{id}/information")
    ContactRoot getContactInformation(@PathVariable Long id) ;

    @PutMapping( path = "/contacts/{id}/information")
    ContactRoot updateContactInformation(@PathVariable("id") Long id, @RequestBody ContactRoot contactRoot) ;



}
