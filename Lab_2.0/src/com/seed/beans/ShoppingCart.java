package com.seed.beans;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//TODO:0	Modification required
public class ShoppingCart {
	private java.util.Collection<String> productIds;

	public ShoppingCart() {
		// TODO:1 Create object of LinkedList,
		// which will be referred using member variable "productIds"
		this.productIds = new LinkedList<String>();
	}

	public java.util.Set<String> getProductSet() {
		// TODO:2 return set of product ids stored in this shopping cart

		return (Set<String>) this.productIds;
	}

	public void setProductList(String[] newProductIds) {
		// TODO:3 add newProductIds into existing list of product ids
		for (int it = 0; it < newProductIds.length; it++) {
			this.productIds.add(newProductIds[it]);
		}
		
	}
}
