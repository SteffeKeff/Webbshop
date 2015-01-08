import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CustomerTest 
{

	Customer steffe = new Customer("Steffe", "Keff", "email", "Stefan", "De Geer", "Sommarbo 228", "0768646474");

	@Test
	public void testConstructor() 
	{
		assertEquals(steffe.getUsername(),"Steffe");
		assertNotEquals(steffe.getUsername(), "teffe");
	}
	
	@Test
	public void testShoppingCart() 
	{
		assertEquals(steffe.getShoppingCart(),new ArrayList<>());
		steffe.addProduct(new Product("a", "b", "c", "d", "e", "f", 1, 2));
		assertNotEquals(steffe.getShoppingCart(),new ArrayList<>());
	}
	
	
}

