package com.cypro.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    @Autowired
    private MailService mailService;
    
    public String sendEmail( String to,  String subject, String text) {
        mailService.sendSimpleMessage(to, subject, text);
        return "Email sent successfully";
    }
}
