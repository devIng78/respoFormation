package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

public class NotebookClient {
	public static void main(String[] args) {
		Notebook_Service notebook_Service = new Notebook_Service();
		Notebook noteBookPort = notebook_Service.getNoteBookPort();
		List<Handler> myHandler = new ArrayList<Handler>();
		myHandler.add(new SOAPLoggingHandler());
		((BindingProvider) noteBookPort).getBinding()
				.setHandlerChain(myHandler);
		Person refPerson = new Person();
		refPerson.setName("Baron Mickael");
		refPerson.setAddress("Poitiers");
		refPerson.setBirthyear("1976");
		boolean addPersonWithComplexType = noteBookPort
				.addPersonWithComplexType(refPerson);
		System.out.println(addPersonWithComplexType);
	}
}