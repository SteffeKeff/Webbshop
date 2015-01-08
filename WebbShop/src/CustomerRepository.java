
public interface CustomerRepository 
{
	
	public void addCustomer(Customer customer);
	
	public Customer getCustomer(String username);
	
	public void updateCustomer(Customer customer);
	
	public void removeCustomer(String username);
	
}
