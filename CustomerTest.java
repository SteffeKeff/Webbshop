import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CustomerTest 
{
	Customer cu = new Customer("Kira", "elf", "erik.welander@hotmail.com", "Erik", "Welander", "Tersv", "073");

	@Test
	public void get()
	{
		assertEquals(cu.getPassword(), "elf");
		assertEquals(cu.getEmail(), "erik.welander@hotmail.com");
		assertEquals(cu.getFirstName(), "Erik");
		assertEquals(cu.getLastName(), "Welander");
		assertEquals(cu.getAddress(), "Tersv");
		assertEquals(cu.getMobileNumber(), "073");
		assertEquals(cu.toString(), "Erik Welander");
		assertEquals(cu.getLoginStatus(), false);
		assertNull(cu.getOrder(0));
		assertEquals(cu.getOrders(), new ArrayList<Order>());
	}
	
	@Test
	public void set()
	{		
		cu.setPassword("Keff");
		cu.setEmail("steffekeff@n");
		cu.setFirstName("Stefan");
		cu.setLastName("De Geer");
		cu.setAddress("SommarBo 228");
		cu.setMobileNumber("0768646474");
		cu.setLoginStatus(true);
		
		assertEquals(cu.getPassword(), "Keff");
		assertEquals(cu.getEmail(), "steffekeff@n");
		assertEquals(cu.getFirstName(), "Stefan");
		assertEquals(cu.getLastName(), "De Geer");
		assertEquals(cu.getAddress(), "SommarBo 228");
		assertEquals(cu.getMobileNumber(), "0768646474");
		assertEquals(cu.getLoginStatus(), true);		
	}
	
	@Test
	public void shopping()
	{
		assertNull(cu.getOrder(0));
		assertEquals(cu.getOrders(), new ArrayList<Order>());
		
		Product p1 = new Product("Computer Peripheral", "High DPI mice", "Minonix", "Naus 3200", "Stylish high-dpi mouse for gaming", "MINIOIX-NAUS-3200.png", 400, 100);
		cu.addProduct(p1);
		
		ArrayList<Product> pa = cu.getShoppingCart();
		assertEquals(pa.get(0), p1);
		assertEquals(pa.size(), 1);
		
		Product p2 = new Product("Computer Peripheral", "Keyboard", "Logitech", "G15", "Keyboard with display and media controls", "LOGITECH-G15.png", 300, 100);
		cu.addProduct(p2);
		
		assertEquals(pa.get(1), p2);
		assertEquals(pa.size(), 2);
		
		cu.getShoppingCart().remove(1);
		assertEquals(pa.size(), 1);
		
		cu.addOrder();
		assertEquals(pa.size(), 0);
		
		assertNotNull(cu.getOrder(0));
		
	}
}

