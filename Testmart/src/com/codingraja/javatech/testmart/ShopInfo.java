package com.codingraja.javatech.testmart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException {
		String response = "Invalid Property";
		if ("ShopName".equals(property)) {
			response = "Test Mart";
		} else if ("Since".equals(property)) {
			response = "Since 2017";
		} else {
			throw new InvalidInputException("Invalid Property", property + " is not a valid input");
		}
		return response;
	}
}
