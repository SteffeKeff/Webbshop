import java.util.ArrayList;


public class ShoppingCart
{
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product addThis)
	{
		products.add(addThis);
	}
	
	public void removeProduct(Product removeThis)
	{
		products.remove(removeThis);
	}
	
	public ArrayList<Product> getProducts()
	{
		return products;
	}
	
	public int getSum()
	{
		int sum = 0;
		for(Product product: products){
			sum += product.getPrice();
		}
		return sum;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		for(Product product: products)
		{
			str.concat(product.getTitle());
			str.concat(", ");
		};
		str.concat(". With the sum of: " + getSum());
		
		return str;
	}
}
