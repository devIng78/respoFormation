package fr.ensma.lisi.notebookwebserviceclient;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : april 2010
 */
public class NotebookClient {
	public static void main(String[] args) {
		NotebookServiceImplService notebook_Service = new NotebookServiceImplService();
		Notebook noteBookPort = notebook_Service.getNotebookServiceImplPort();
		Person refPerson = new Person();
		refPerson.setName("Baron Mickael");
		refPerson.setAddress("Poitiers");
		refPerson.setBirthyear("1976");
				
		boolean addPersonWithComplexType = noteBookPort.addPersonWithComplexType(refPerson);
		
		System.out.println(addPersonWithComplexType);
	}
}
