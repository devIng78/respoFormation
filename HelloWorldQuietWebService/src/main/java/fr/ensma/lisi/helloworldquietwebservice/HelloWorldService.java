package fr.ensma.lisi.helloworldquietwebservice;

import javax.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : april 2010
 */
@WebService
public class HelloWorldService {
    
	public String makeHelloWorld(String value) throws Exception{
		return "Hello World to " + value;
	}
	
	public String simpleHelloWorld() {
		return "Hello World to everybody";
	}
}
