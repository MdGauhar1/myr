package com.mdgauhar.portfolio.service;

import com.mdgauhar.portfolio.model.ContactMessage;
import com.mdgauhar.portfolio.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public ContactMessage saveContactMessage(ContactMessage contactMessage) {
        contactMessage.setTimestamp(LocalDateTime.now());
        return contactMessageRepository.save(contactMessage);
    }
}

