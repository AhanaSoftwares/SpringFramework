package com.ahanasoftwares.factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        GetXMLMessage xmlMsg = new ErrorXMLDisplay();
        xmlMsg.xmlParser().parseMessage();
        GetXMLMessage xmlMsg1 = new FeedbackXMLDisplay();
        xmlMsg1.xmlParser().parseMessage();
    }
}
