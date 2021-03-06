
package fr.ensma.lisi.notebookwebserviceclient;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Notebook", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Notebook {


    /**
     * 
     * @param birthyear
     * @param address
     * @param name
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addPersonWithSimpleType", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.AddPersonWithSimpleType")
    public void addPersonWithSimpleType(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "birthyear", targetNamespace = "")
        String birthyear);

    /**
     * 
     * @param personName
     * @return
     *     returns fr.ensma.lisi.notebookwebserviceclient.Person
     */
    @WebMethod
    @WebResult(name = "getPersonResult", targetNamespace = "")
    @RequestWrapper(localName = "getPersonByName", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.GetPersonByName")
    @ResponseWrapper(localName = "getPersonByNameResponse", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.GetPersonByNameResponse")
    public Person getPersonByName(
        @WebParam(name = "personName", targetNamespace = "")
        String personName);

    /**
     * 
     * @param newPerson
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "addPersonWithComplexTypeResult", targetNamespace = "")
    @RequestWrapper(localName = "addPersonWithComplexType", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.AddPersonWithComplexType")
    @ResponseWrapper(localName = "addPersonWithComplexTypeResponse", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.AddPersonWithComplexTypeResponse")
    public boolean addPersonWithComplexType(
        @WebParam(name = "newPerson", targetNamespace = "")
        Person newPerson);

    /**
     * 
     * @return
     *     returns java.util.List<fr.ensma.lisi.notebookwebserviceclient.Person>
     */
    @WebMethod
    @WebResult(name = "getPersonsResult", targetNamespace = "")
    @RequestWrapper(localName = "getPersons", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.GetPersons")
    @ResponseWrapper(localName = "getPersonsResponse", targetNamespace = "http://notebookwebservice.lisi.ensma.fr/", className = "fr.ensma.lisi.notebookwebserviceclient.GetPersonsResponse")
    public List<Person> getPersons();

}
