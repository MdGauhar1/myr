package com.mdgauhar.portfolio.controller;

import com.mdgauhar.portfolio.model.ContactMessage;
import com.mdgauhar.portfolio.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactMessageController {

    @Autowired
    private ContactMessageService contactMessageService;

    @PostMapping
    public ResponseEntity<ContactMessage> submitContactMessage(@RequestBody ContactMessage contactMessage) {
        ContactMessage savedMessage = contactMessageService.saveContactMessage(contactMessage);
        return ResponseEntity.ok(savedMessage);
    }
}

