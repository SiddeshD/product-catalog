/**
 * 
 */
package com.spring.boot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 *
 */
public class Products {
	
	private List<Product> products = new ArrayList<>();
	
	public Products() {
		super();
	}

	public Products(List<Product> products) {
		super();
		this.products = products;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Products [products=" + products + "]";
	}
	
}
