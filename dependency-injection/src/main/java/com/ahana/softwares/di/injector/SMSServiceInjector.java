package com.ahana.softwares.di.injector;

import com.ahana.softwares.di.consumer.Consumer;
import com.ahana.softwares.di.consumer.MyDIApplication;
import com.ahana.softwares.di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
