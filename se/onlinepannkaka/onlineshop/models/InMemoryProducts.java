package se.onlinepannkaka.onlineshop.models;
import java.util.HashMap;

import se.onlinepannkaka.onlineshop.repositories.ProductRepository;

public class InMemoryProducts implements ProductRepository
{
	
	private HashMap<String, Product> products = new HashMap<String, Product>();
	
	@Override
	public void addProduct(Product product)
	{
		if(!products.containsKey(product.getTitle()))
		{
			products.put(product.getTitle(), product);
		}
	}

	@Override
	public Product getProduct(String title) 
	{
		return products.getOrDefault(title,null);
	}

	@Override
	public HashMap<String,Product> getProducts() 
	{
		return products;
	}

	@Override
	public void removeProduct(String title) 
	{
		products.remove(title);
	}

	@Override
	public void updateProduct(Product product) 
	{
		products.replace(product.getTitle(), product);
	}
}
