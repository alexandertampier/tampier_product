package at.spengergasse.product.domain;

import java.util.*;

public class Company {
	private Set<Product> products;
	String name;

	public Company() {
		this.products = new TreeSet<Product>();
		this.name = "IBM";
	}

	public Set<Product> getInterneListe() {
		return Collections.unmodifiableSet(products);
	}
}
