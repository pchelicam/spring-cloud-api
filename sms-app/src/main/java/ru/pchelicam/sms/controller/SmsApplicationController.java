package ru.pchelicam.sms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsApplicationController {

    @GetMapping("/send")
    public ResponseEntity<?> sendSms() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
