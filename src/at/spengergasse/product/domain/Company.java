package at.spengergasse.product.domain;

import java.util.*;

public class Company {
	private List<Product> products;
	String name;

	public Company() {
		this.products = new ArrayList<Product>();
		this.name = "IBM";
	}

	public List<Product> getInterneListe() {
		return Collections.unmodifiableList(products);
	}
}
