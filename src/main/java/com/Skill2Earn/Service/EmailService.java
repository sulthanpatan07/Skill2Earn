package com.Skill2Earn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendApprovalEmail(String to, String skillTitle) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject("Skill Approved");
        msg.setText("Your skill post '" + skillTitle + "' has been approved.");
        mailSender.send(msg);
    }

    public void sendRejectionEmail(String to, String skillTitle) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject("Skill Rejected");
        msg.setText("Your skill post '" + skillTitle + "' has been rejected.");
        mailSender.send(msg);
    }
}
