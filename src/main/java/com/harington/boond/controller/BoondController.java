package com.harington.boond.controller;

import com.harington.boond.client.BoondFeignClient;
import com.harington.boond.model.User;
import com.harington.boond.model.companies.CompaniesRoot;
import com.harington.boond.model.contact.output.ContactRoot;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BoondController {
    private String appMode;

    @Autowired
    private BoondFeignClient boondFeignClient;

    @GetMapping("/")
    public String accueil(Model model) {
        model.addAttribute("module", "home");

        return "index";
    }

    @GetMapping("/companies")
    public String getAllCompabies(Model model) {
        CompaniesRoot allCompanies = boondFeignClient.getAllCompanies();

        model.addAttribute("companies", allCompanies);
        model.addAttribute("module", "companies");

        return "companiesList";
    }


    @PostMapping("/upload-csv-file")
    public String uploadCSVFile(@RequestParam("file") MultipartFile file, Model model) {

        // validate file
        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a CSV file to upload.");
            model.addAttribute("status", false);
        } else {

            // parse CSV file to create a list of `User` objects
            try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {

                // create csv bean reader
                CsvToBean<User> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(User.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();

                // convert `CsvToBean` object to list of users
                List<User> users = csvToBean.parse();

                // TODO: save users in DB?

                // save users list on model
                model.addAttribute("users", users);
                model.addAttribute("status", true);

            } catch (Exception ex) {
                model.addAttribute("message", "An error occurred while processing the CSV file.");
                model.addAttribute("status", false);
            }
        }

        return "file-upload-status";
    }

    @PostMapping("/upload-hardbounces")
    public String uploadHardBounces(@RequestParam("file") MultipartFile file, Model model) {


        // validate file
        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a CSV file to upload.");
            model.addAttribute("status", false);
        } else {

            // parse CSV file to create a list of `User` objects
            try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {

                // create csv bean reader
                CsvToBean<User> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(User.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();

                // convert `CsvToBean` object to list of users
                List<User> users = csvToBean.parse();
                List<ContactRoot> listOfContacts = new ArrayList<>();
                for (User u : users) {

                    ContactRoot contactInformation = boondFeignClient.getContactInformation(u.getId());

                    listOfContacts.add(contactInformation);
                    contactInformation.getData().getRelationships().getCompany().getData().setId("1");
                    boondFeignClient.updateContactInformation(contactInformation);
                }

                // TODO: save users in DB?

                // save users list on model
                model.addAttribute("users", users);
                model.addAttribute("status", true);
                model.addAttribute("contacts", listOfContacts);

            } catch (Exception ex) {
                model.addAttribute("message", "An error occurred while processing the CSV file.");
                model.addAttribute("status", false);
            }
        }

        return "contactsList";
    }

}
