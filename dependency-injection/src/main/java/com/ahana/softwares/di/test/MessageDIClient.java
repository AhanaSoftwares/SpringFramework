package com.ahana.softwares.di.test;

import com.ahana.softwares.di.consumer.Consumer;
import com.ahana.softwares.di.injector.EmailServiceInjector;
import com.ahana.softwares.di.injector.MessageServiceInjector;
import com.ahana.softwares.di.injector.SMSServiceInjector;

public class MessageDIClient {

	public static void main(String[] args) {
		String msg = "Spring Framework DI";
		String email = "lms@ahanasoftwares.net";
		String phone = "1234567890";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
