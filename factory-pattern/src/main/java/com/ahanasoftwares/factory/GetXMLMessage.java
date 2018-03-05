package com.ahanasoftwares.factory;

import com.ahanasoftwares.factory.service.XMLParser;

public abstract class GetXMLMessage {

	public void showMessage() {
		XMLParser xp = xmlParser();
		String parseMessage = xp.parseMessage();
		System.out.println(parseMessage);
	}
	
	public abstract XMLParser xmlParser();
		
}
