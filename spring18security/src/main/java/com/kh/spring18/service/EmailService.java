package com.kh.spring18.service;

import java.io.IOException;

import javax.mail.MessagingException;

public interface EmailService {
	void sendCelevration(String email) throws MessagingException, IOException;
}
