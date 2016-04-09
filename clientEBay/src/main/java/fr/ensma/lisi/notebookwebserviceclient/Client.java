package fr.ensma.lisi.notebookwebserviceclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

public class Client {

	public static void main(String[] args) {

		String strBaseURL = "http://svcs.ebay.com/services/search/FindingService/v1";
		FindingService service = new FindingService();

		FindingServicePortType port = service.getFindingServiceSOAPPort();
		BindingProvider bp = (BindingProvider) port;
		List<Handler> myHandler = new ArrayList<Handler>();
		myHandler.add(new SOAPLoggingHandler());
		bp.getBinding().setHandlerChain(myHandler);

		Map<String, Object> requestProperties = bp.getRequestContext();
		Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();

		httpHeaders.put("X-EBAY-SOA-MESSAGE-PROTOCOL",
				Collections.singletonList("SOAP12"));
		httpHeaders.put("X-EBAY-SOA-OPERATION-NAME",
				Collections.singletonList("findItemsAdvanced"));

		// Edit the following line to insert your AppID to set the
		// X-EBAY-SOA-SECURITY-APPNAME correctly
		httpHeaders.put("X-EBAY-SOA-SECURITY-APPNAME", Collections
				.singletonList("yassinem-Formatio-PRD-de7ff2694-e2a36a12"));
		requestProperties.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
		requestProperties.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				strBaseURL);

		FindItemsAdvancedRequest req = new FindItemsAdvancedRequest();
		List<OutputSelectorType> opSelector = req.getOutputSelector();
		opSelector.add(OutputSelectorType.SELLER_INFO);
		ItemFilter objFilter1 = new ItemFilter();
		objFilter1.setName(ItemFilterType.AVAILABLE_TO);
		objFilter1.getValue().add("US");
		ItemFilter objFilter2 = new ItemFilter();
		objFilter2.setName(ItemFilterType.LISTING_TYPE);
		objFilter2.getValue().add("All");
		ItemFilter objFilter3 = new ItemFilter();
		objFilter3.setName(ItemFilterType.HIDE_DUPLICATE_ITEMS);
		objFilter3.getValue().add("true");
		List<ItemFilter> itemFilter = req.getItemFilter();
		itemFilter.add(objFilter1);
		itemFilter.add(objFilter2);
		itemFilter.add(objFilter3);
		List<String> catID = req.getCategoryId();
		catID.add("279");
		req.setSortOrder(SortOrderType.END_TIME_SOONEST);
		req.setKeywords("Harry Potter");

		FindItemsAdvancedResponse res = port.findItemsAdvanced(req);
		SearchResult searchResult = res.getSearchResult();
		List<SearchItem> item = searchResult.getItem();
		for (SearchItem searchItem : item) {
			System.out.println(searchItem.getGalleryURL());
		}
		System.out.println("Search Count: " + searchResult.getCount());

	}

}
