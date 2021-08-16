package com.example.testingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api")
public class SimpleEmailController {

    @Autowired
    EmailService emailService;

    @GetMapping("/sendemail")
    public String sendEmail() throws FileNotFoundException {
        return emailService.sendEmail();
    }


}
