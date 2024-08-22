package com.codexnovas.emailsenderapplication.services;


import java.io.File;

// hum yahan pe inerface use kar rahe hain agar aage ja kar kuchh bhi dependencies ka prob aaye toh
//humain sara code ko change karna na pade hum sirf dependencies and implementation hi change karenge
public interface EmailSenderService {
    // sending the email to single user
    void sendEmailToSingleUser(String to,String subject,String msg);

    // sending mail to multiple user
    void sendEmailToMultipleUser(String []to,String subject,String msg);

    // sending mail with html
    void sendEmailWithHtml(String to,String subject,String htmlContent);

    // sending email with file
    void sendEmailWithFile(String to, String subject, String msg, File file);
}
