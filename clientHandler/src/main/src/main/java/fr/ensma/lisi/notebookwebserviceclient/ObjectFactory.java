
package fr.ensma.lisi.notebookwebserviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.ensma.lisi.notebookwebserviceclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPersonWithComplexTypeResponse_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "addPersonWithComplexTypeResponse");
    private final static QName _AddPersonWithSimpleType_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "addPersonWithSimpleType");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "getPersonsResponse");
    private final static QName _GetPersons_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "getPersons");
    private final static QName _GetPersonByNameResponse_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "getPersonByNameResponse");
    private final static QName _GetPersonByName_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "getPersonByName");
    private final static QName _AddPersonWithComplexType_QNAME = new QName("http://notebookwebservice.lisi.ensma.fr/", "addPersonWithComplexType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.ensma.lisi.notebookwebserviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonByNameResponse }
     * 
     */
    public GetPersonByNameResponse createGetPersonByNameResponse() {
        return new GetPersonByNameResponse();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link AddPersonWithSimpleType }
     * 
     */
    public AddPersonWithSimpleType createAddPersonWithSimpleType() {
        return new AddPersonWithSimpleType();
    }

    /**
     * Create an instance of {@link AddPersonWithComplexTypeResponse }
     * 
     */
    public AddPersonWithComplexTypeResponse createAddPersonWithComplexTypeResponse() {
        return new AddPersonWithComplexTypeResponse();
    }

    /**
     * Create an instance of {@link AddPersonWithComplexType }
     * 
     */
    public AddPersonWithComplexType createAddPersonWithComplexType() {
        return new AddPersonWithComplexType();
    }

    /**
     * Create an instance of {@link GetPersonByName }
     * 
     */
    public GetPersonByName createGetPersonByName() {
        return new GetPersonByName();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonWithComplexTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "addPersonWithComplexTypeResponse")
    public JAXBElement<AddPersonWithComplexTypeResponse> createAddPersonWithComplexTypeResponse(AddPersonWithComplexTypeResponse value) {
        return new JAXBElement<AddPersonWithComplexTypeResponse>(_AddPersonWithComplexTypeResponse_QNAME, AddPersonWithComplexTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonWithSimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "addPersonWithSimpleType")
    public JAXBElement<AddPersonWithSimpleType> createAddPersonWithSimpleType(AddPersonWithSimpleType value) {
        return new JAXBElement<AddPersonWithSimpleType>(_AddPersonWithSimpleType_QNAME, AddPersonWithSimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsResponse> createGetPersonsResponse(GetPersonsResponse value) {
        return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME, GetPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "getPersons")
    public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
        return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "getPersonByNameResponse")
    public JAXBElement<GetPersonByNameResponse> createGetPersonByNameResponse(GetPersonByNameResponse value) {
        return new JAXBElement<GetPersonByNameResponse>(_GetPersonByNameResponse_QNAME, GetPersonByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "getPersonByName")
    public JAXBElement<GetPersonByName> createGetPersonByName(GetPersonByName value) {
        return new JAXBElement<GetPersonByName>(_GetPersonByName_QNAME, GetPersonByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonWithComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notebookwebservice.lisi.ensma.fr/", name = "addPersonWithComplexType")
    public JAXBElement<AddPersonWithComplexType> createAddPersonWithComplexType(AddPersonWithComplexType value) {
        return new JAXBElement<AddPersonWithComplexType>(_AddPersonWithComplexType_QNAME, AddPersonWithComplexType.class, null, value);
    }

}
