package fr.ensma.lisi.helloworldwebservice;

import javax.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : april 2010
 */
@WebService(endpointInterface="fr.ensma.lisi.helloworldwebservice.HelloWorldService", serviceName="HelloWorld", portName="HelloWorldPort")
public class HelloWorldServiceImpl implements HelloWorldService {
    
	public String makeHelloWorld(String value) {
		return "Hello World to " + value;
	}
	
	public String simpleHelloWorld() {
		return "Hello World to everybody";
	}
}
