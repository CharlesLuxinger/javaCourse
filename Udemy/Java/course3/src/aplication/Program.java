package aplication;

import entities.Products;

public class Program {

	public static void main(String[] args) {

		Products product = new Products();

		product.setDataProducts();
		
		product.getDataProducts();
		
		product.addProducts(12);
		
		product.getDataProducts();
		
		product.removeProducts(5);
		
		product.getDataProducts();
	}

}
