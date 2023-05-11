package ru.pchelicam.push.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushApplicationController {

    @GetMapping("/send")
    public ResponseEntity<?> sendPush() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
