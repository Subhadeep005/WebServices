package com.codingraja.javatech.testmart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.codingraja.javatech.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action = "fetch_catagories", operationName = "fetchCatagories")
	List<String> getproductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	List<Product> getProductsv2(String category);

}