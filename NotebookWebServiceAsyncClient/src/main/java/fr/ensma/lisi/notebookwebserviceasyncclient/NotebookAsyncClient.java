package fr.ensma.lisi.notebookwebserviceasyncclient;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : april 2010
 */
public class NotebookAsyncClient {
	public static void main(String[] args) {
		NotebookServiceImplService notebook_Service = new NotebookServiceImplService();
		Notebook noteBookPort = notebook_Service.getNotebookServiceImplPort();

		Person refPerson = new Person();
		refPerson.setName("Baron Mickael");
		refPerson.setAddress("Poitiers");
		refPerson.setBirthyear("1976");

		
		noteBookPort.addPersonWithComplexTypeAsync(refPerson,
				new AsyncHandler<AddPersonWithComplexTypeResponse>() {

					@Override
					public void handleResponse(
							Response<AddPersonWithComplexTypeResponse> res) {
						if (!res.isCancelled() && res.isDone()) {
							try {
								AddPersonWithComplexTypeResponse value = res
										.get();
								System.out.println(value
										.isAddPersonWithComplexTypeResult());
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				});

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminé");
	}
}
