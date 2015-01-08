import static org.junit.Assert.*;

import org.junit.Test;


public class AccountTest 
{

	@Test
	public void testConstructor() 
	{
		Account steffe = new Account("Steffe","Keff","email");
		assertEquals(steffe.getUsername(), "Steffe");
		assertEquals(steffe.getPassword(), "Keff");
		assertEquals(steffe.getEmail(), "email");
		
		assertNotEquals(steffe.getUsername(), "teffe");
	}

}
