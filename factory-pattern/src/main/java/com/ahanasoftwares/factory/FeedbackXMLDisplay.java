package com.ahanasoftwares.factory;

import com.ahanasoftwares.factory.service.FeedbackXML;
import com.ahanasoftwares.factory.service.XMLParser;

public class FeedbackXMLDisplay extends GetXMLMessage{

	@Override
	public XMLParser xmlParser() {
		return new FeedbackXML();
	}


}
