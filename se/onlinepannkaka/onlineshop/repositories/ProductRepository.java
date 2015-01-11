package se.onlinepannkaka.onlineshop.repositories;
import java.util.HashMap;

import se.onlinepannkaka.onlineshop.Product;

public interface ProductRepository 
{
	
	public void addProduct(Product product);
	
	public Product getProduct(String title);
	
	public HashMap<String,Product> getProducts();
	
	public void removeProduct(String title);
	
	public void updateProduct(String title, Product product);
	
}
