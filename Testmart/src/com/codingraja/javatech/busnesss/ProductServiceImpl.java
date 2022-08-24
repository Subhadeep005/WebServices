package com.codingraja.javatech.busnesss;

import java.util.ArrayList;
import java.util.List;

import com.codingraja.javatech.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The game of Thrones");

		moviesList.add("OZ the greet and powerfull");
		moviesList.add("Dispicable Me");
		moviesList.add("Star trek into darkness");

		musicList.add("Random Access Memories");
		musicList.add("Night vision");
		musicList.add("Dispacito");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "movies":
			return moviesList;
		case "music":
			return musicList;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {

		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "movies":
			moviesList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productlist = new ArrayList<>();
		productlist.add(new Product("Java Brains", "1234", 999.98));
		productlist.add(new Product("Another Book", "ABC", 5543.45));
		return productlist;
	}

}
