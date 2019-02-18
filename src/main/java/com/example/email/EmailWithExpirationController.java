package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailWithExpirationController {

    private EmailSenderService senderService;

    @Autowired(required = true)
    public EmailWithExpirationController(EmailSenderService senderService) {
        this.senderService = senderService;
    }

    @PostMapping("/email")
    public void sendEmail() {

    }
}
