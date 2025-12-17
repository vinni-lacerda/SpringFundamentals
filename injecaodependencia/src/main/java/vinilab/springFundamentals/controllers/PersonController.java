package vinilab.springFundamentals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vinilab.springFundamentals.request.converters.PersonServices;

@RestController
public class PersonController {

    @Autowired
    private PersonServices personServices;
}
