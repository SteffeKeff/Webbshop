package se.onlinepannkaka.onlineshop;
import java.util.ArrayList;


public class ShoppingCart
{
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product)
	{
		products.add(product);
	}
	
	public void removeProduct(Product product)
	{
		products.remove(product);
	}
	
	public ArrayList<Product> getProducts()
	{
			return products;
	}
	
	public double getSum()
	{
		double sum = 0;
		for(Product product: products){
			sum += (double) product.getPrice();
		}
		return sum;
	}
	
	public void clear()
	{
		products.clear();
	}

	@Override
	public String toString()
	{
		return "ShoppingCart [products=" + products + "]";
	}
	
}
