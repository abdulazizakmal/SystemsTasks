package com.example.testingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
public class EmailService {
    @Autowired
    JavaMailSender javaMailSender;
    public String sendEmail() throws FileNotFoundException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("abdul.aziz.akmal08@gmail.com");
        message.setTo("abdul.aziz.akmal08@gmail.com");
        message.setSubject("test");
        message.setText(readText());

        javaMailSender.send(message);
        return "Mail sent successfully";

    }
    public String readText() throws FileNotFoundException {
        File file = new File("C:\\Users\\abdulaziz.akmal\\IdeaProjects\\testingapp\\src\\main\\java\\com\\example\\testingapp\\email.txt");
        Scanner scan = new Scanner(file);
        return scan.nextLine();

    }
}
