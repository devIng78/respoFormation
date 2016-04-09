package fr.ensma.lisi.helloworldwebservice;

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
@WebService(name="HelloWorld",targetNamespace="http://helloworldwebservice.lisi.ensma.fr/")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface HelloWorldService {
	
	@WebMethod(operationName="makeHelloWorld")
	@WebResult(name="helloWorldResult")
	public String makeHelloWorld(
			@WebParam(name = "value")String value);
	
	@WebMethod(operationName="simpleHelloWorld")
	@WebResult(name="helloWorldResult")
	public String simpleHelloWorld();
}
