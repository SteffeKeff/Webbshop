package se.onlinepannkaka.onlineshop;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import se.onlinepannkaka.onlineshop.models.InMemoryCustomers;
import se.onlinepannkaka.onlineshop.models.InMemoryOrders;
import se.onlinepannkaka.onlineshop.models.InMemoryProducts;

public class MainTest 
{

	ShopService ss = new ShopService(new InMemoryCustomers(), new InMemoryProducts(), new InMemoryOrders());
	
	@Test
	public void test()
	{
		assertNotNull(ss);
		
		Customer c1 = new Customer("Steffe", "Keff", "sdgkeff@gmail.com", "Stefan", "De Geer", "Sommarbo 228", "0768646474");
		Customer c2 = new Customer("Be", "oz", "beoz@hotmail.com", "be", "oz", "Nyn�sv�gen 1", "070123456789");
		
		ss.addCustomer(c1);
		ss.addCustomer(c2);
		
		assertEquals(c1, ss.getCustomer("Steffe"));
		assertEquals(c2, ss.getCustomer("Be"));
		
		Product p1 = new Product("Klassisk pannkaka", "Pannkakor" , "Stefan", "V�r klassiska och mycket uts�kta pannkaka", "klassiskPannkaka.png", 10.90, 60);
		Product p2 = new Product("Amerikansk pannkaka", "Pannkakor" , "Erik", "En lite tjockare men mycket god pannkaka som passar till sirap", "amerikanskPannkaka.png", 13.90, 40);
		Product p3 = new Product("Belgisk v�ffla", "V�fflor", "Osama", "Den belgiska v�fflan �r lite tjock och mycket frasig", "belgiskVaffla.png", 12.90, 50);
		
		ss.addProduct(p1);
		ss.addProduct(p2);
		ss.addProduct(p3);
		
		assertEquals(p1, ss.getProduct("Klassisk pannkaka"));
		assertEquals(p2, ss.getProduct("Amerikansk pannkaka"));
		assertEquals(p3, ss.getProduct("Belgisk v�ffla"));
		assertEquals(3, ss.getProducts().size());
		
		assertEquals(0, ss.getCustomer("Steffe").getShoppingCart().size());
		ss.getCustomer("Steffe").addProduct(p1);
		ss.getCustomer("Steffe").addProduct(p2);
		ss.getCustomer("Steffe").addProduct(p3);
		assertEquals(3, ss.getCustomer("Steffe").getShoppingCart().size());
		
		assertEquals(ss.getCustomer("Steffe").getShoppingCart().get(0), p1);
		assertEquals(ss.getCustomer("Steffe").getShoppingCart().get(1), p2);
		assertEquals(ss.getCustomer("Steffe").getShoppingCart().get(2), p3);
		
		assertEquals(ss.getAllOrders(), new HashMap<String,Order>());
		
		ss.addOrder("Steffe");
		ss.getCustomer("Steffe").getOrder(0).shipIt();
		assertEquals(1, ss.getAllOrders().size());
		assertEquals(1, ss.getCustomer("Steffe").getOrders().size());
		assertEquals(0, ss.getCustomer("Steffe").getShoppingCart().size());
		
		ss.getCustomer("Steffe").addProduct(p1);
		ss.removeProduct("Klassisk pannkaka");
		
		assertEquals(new ArrayList<Product>(), ss.getCustomer("Steffe").getShoppingCart());
		
	}

}
