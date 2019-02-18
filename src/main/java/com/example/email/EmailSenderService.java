package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class EmailSenderService {

    @Autowired
    public EmailSenderService() {
    }

    void sendEmail() {
        // TODO: use JavaMail to send simple email with expiration
    }
}
