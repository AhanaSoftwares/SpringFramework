package com.ahanasoftwares.factory.service;

public class ErrorXmlPraser implements XMLParser {

	public String parseMessage() {
		System.out.println("Parsing Error XML");
		return "Error XML";
	}

}
