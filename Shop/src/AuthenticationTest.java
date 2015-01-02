import static org.junit.Assert.*;

import org.junit.Test;


public class AuthenticationTest {
	
	@Test
	public void test() {
		Authentication a = new Authentication();
		a.addCustomer("Steffe", "keff", "mail");
		a.addCustomer("Steffe","keff","MAIL");
		a.addCustomer("Erik","Welander","eriksMail");
		
		assertNull(a.getAccount("Stefe"));
		assertEquals(a.getAccount("Steffe").getEmail(),"mail");

		a.getAccount("Steffe").setEmail("sdgkeff@gmail.com"); 
		
		assertEquals(a.getAccount("Steffe").getEmail(),"sdgkeff@gmail.com");
		assertNotEquals(a.getAccount("Erik"),"sdgkeff@gmail.com");
	}	

}
