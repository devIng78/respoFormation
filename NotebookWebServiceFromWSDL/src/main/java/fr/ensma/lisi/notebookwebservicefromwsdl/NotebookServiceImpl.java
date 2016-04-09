package fr.ensma.lisi.notebookwebservicefromwsdl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.ensma.lisi.notebookwebservicefromwsdl.Notebook")
public class NotebookServiceImpl {

	public boolean addPersonWithComplexType(Person newPerson) {
		return true;
	}

	public Person getPersonByName(String name) {
		Person current = new Person();
		current.setName(name);
		current.setBirthyear("1976");
		current.setAddress("17 Square Mickael BARON");
		return current;
	}

	public List<Person> getPersons() {
		Person first = new Person();
		first.setName("Ken BLOCK");
		first.setBirthyear("1967");
		first.setAddress("United States");
		Person second = new Person();
		second.setName("Colin MCRAE");
		second.setBirthyear("1968");
		second.setAddress("Scotland");
		List<Person> tabPerson = new ArrayList<Person>();
		tabPerson.add(first);
		tabPerson.add(second);
		return tabPerson;
	}

	public void addPersonWithSimpleType(String name, String address,
			String birthyear) {
		System.out.println("Name : " + name + " Address : " + address
				+ " birthyear : " + birthyear);
	}

}
