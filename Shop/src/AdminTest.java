import static org.junit.Assert.*;

import org.junit.Test;


public class AdminTest {

	@Test
	public void testConstructor() {
		Admin steffe = new Admin("Steffe","Keff","email");
		assertEquals(steffe.getUsername(), "Steffe");
		assertEquals(steffe.getPassword(), "Keff");
		assertEquals(steffe.getEmail(), "email");
		
		assertNotEquals(steffe.getUsername(), "teffe");
	}

}
