package fr.ensma.lisi.notebookwebservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : april 2010
 */
@WebService(endpointInterface="fr.ensma.lisi.notebookwebservice.NotebookService", serviceName="Notebook", portName="NoteBookPort")
public class NotebookServiceImpl implements NotebookService {
    
	@Override
	public boolean addPersonWithComplexType(Person newPerson) {
		System.out.println("Starting process ...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Name : " + newPerson.getName() + " Address : " + newPerson.getAddress() + " birthyear : " + newPerson.getBirthyear());
		
		return true;
	}

	@Override
	public Person getPersonByName(String name) {
		Person current = new Person();
		current.setName(name);
		current.setBirthyear("1976");
		current.setAddress("17 Square Mickael BARON");

		return current;
	}

	@Override
	public List<Person> getPersons() {
		Person first = new Person();
		first.setName("Ken BLOCK");
		first.setBirthyear("1967");
		first.setAddress("United States");
		
		Person second = new Person();
		second.setName("Colin MCRAE");
		second.setBirthyear("1968");
		second.setAddress("Scotland");
		
		//Person[] tabPerson = new Person[2];
		List<Person> tabPerson= new ArrayList<Person>();
		tabPerson.add(first);
		tabPerson.add(second);
		
		
		return tabPerson;
	}

	@Override
	public void addPersonWithSimpleType(String name, String address, String birthyear) {			
		System.out.println("Name : " + name + " Address : " + address + " birthyear : " + birthyear);
	}
}
