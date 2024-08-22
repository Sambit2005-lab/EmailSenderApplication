package com.codexnovas.emailsenderapplication.services.impl;

import com.codexnovas.emailsenderapplication.services.EmailSenderService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

    private JavaMailSender javaMailSender;  // we have to use this JavaMailSender yeh pahle se banaya hua hain springboot

    public EmailSenderServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    @Override
    public void sendEmailToSingleUser(String to, String subject, String msg) {

        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo();
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(msg);
        javaMailSender.send(simpleMailMessage);

    }

    @Override
    public void sendEmailToMultipleUser(String[] to, String subject, String msg) {

    }

    @Override
    public void sendEmailWithHtml(String to, String subject, String htmlContent) {

    }

    @Override
    public void sendEmailWithFile(String to, String subject, String msg, File file) {

    }
}
