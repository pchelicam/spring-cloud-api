package ru.pchelicam.email.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailApplicationController {

    @GetMapping("/send")
    public ResponseEntity<?> sendEmail() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
