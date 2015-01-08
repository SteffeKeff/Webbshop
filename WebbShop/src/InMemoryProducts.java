import java.util.HashMap;

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
	public void updateProduct(String title, Product product) 
	{
		products.replace(title, product);
	}
}
