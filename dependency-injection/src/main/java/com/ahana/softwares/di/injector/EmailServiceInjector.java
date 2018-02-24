package com.ahana.softwares.di.injector;

import com.ahana.softwares.di.consumer.Consumer;
import com.ahana.softwares.di.consumer.MyDIApplication;
import com.ahana.softwares.di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {


	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
