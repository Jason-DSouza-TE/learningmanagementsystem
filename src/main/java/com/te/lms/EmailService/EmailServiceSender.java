package com.te.lms.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceSender {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String sendMail(String toEmail, String subject, String body) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("rakeshjaisondsouza02@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		javaMailSender.send(message);
		return "mail sent successfully........";
		
	}
	

}
