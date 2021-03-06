package fr.ensma.lisi.notebookwebservicefromjavase;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : april 2010
 */
@WebService(name="Notebook",targetNamespace="http://notebookwebservice.lisi.ensma.fr/")
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)
public interface NotebookService {
	
	@WebMethod(operationName="addPersonWithComplexType")
	@WebResult(name="addPersonWithComplexTypeResult")
	public boolean addPersonWithComplexType(
			@WebParam(name = "newPerson")Person newPerson);

	@WebMethod(operationName="addPersonWithSimpleType")
	@WebResult(name="addPersonWithSimpleTypeResult")
	@Oneway
	public void addPersonWithSimpleType(
			@WebParam(name = "name")String name,
			@WebParam(name = "address")String address,
			@WebParam(name = "birthyear")String birthyear);
	
	@WebMethod(operationName="getPersonByName")
	@WebResult(name="getPersonResult")
	public Person getPersonByName(
			@WebParam(name = "personName")String name);
	
	@WebMethod(operationName="getPersons")
	@WebResult(name="getPersonsResult")
	public Person[] getPersons();
}
