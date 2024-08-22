package com.codexnovas.emailsenderapplication.services.impl;

import com.codexnovas.emailsenderapplication.services.EmailSenderService;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {


    @Override
    public void sendEmailToSingleUser(String to, String subject, String msg) {


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
