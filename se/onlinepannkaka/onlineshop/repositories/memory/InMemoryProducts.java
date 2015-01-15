package se.onlinepannkaka.onlineshop.repositories.memory;
import java.util.HashMap;

import se.onlinepannkaka.onlineshop.models.Product;
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
		if(products.containsKey(title))
		{
			return products.get(title);
		}
		return new Product("","","","","",0,0); //Will return an empty product to counter nullPointer
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
