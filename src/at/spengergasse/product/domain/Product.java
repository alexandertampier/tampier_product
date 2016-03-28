package at.spengergasse.product.domain;

public class Product {
	private String name;
	private boolean onStock;

	public Product() {
		this.name = "Coca cola";
		this.onStock = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOnStock() {
		return onStock;
	}

	public void setOnStock(boolean onStock) {
		this.onStock = onStock;
	}
	
		
}
