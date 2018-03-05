package com.ahanasoftwares.factory;

import com.ahanasoftwares.factory.service.ErrorXmlPraser;
import com.ahanasoftwares.factory.service.XMLParser;

public class ErrorXMLDisplay  extends GetXMLMessage{

	@Override
	public XMLParser xmlParser() {
	
		return new ErrorXmlPraser();
	}

}
