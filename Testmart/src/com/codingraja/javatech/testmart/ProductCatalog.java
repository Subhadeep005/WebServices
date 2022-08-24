package com.codingraja.javatech.testmart;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.codingraja.javatech.busnesss.ProductServiceImpl;
import com.codingraja.javatech.model.Product;

@WebService(endpointInterface = "com.codingraja.javatech.testmart.ProductCatalogInterface", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();

	@Override
	public List<String> getproductCategories() {
		return productService.getProductCategories();
	}

	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	@Override
	@WebResult(name = "product")
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
}
