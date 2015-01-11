package se.onlinepannkaka.onlineshop.models;
import java.util.HashMap;

import se.onlinepannkaka.onlineshop.Customer;
import se.onlinepannkaka.onlineshop.repositories.CustomerRepository;

public class InMemoryCustomers implements CustomerRepository 
{

	private HashMap<String, Customer> accounts = new HashMap<String, Customer>();
	
	@Override
	public void addCustomer(Customer customer)
	{
		if(!accounts.containsKey(customer.getUsername()))
		{
			accounts.put(customer.getUsername(), customer);
		}
	}

	@Override
	public Customer getCustomer(String username) 
	{
		return accounts.getOrDefault(username, null);
	}
	
	@Override
	public void updateCustomer(Customer customer) 
	{
		accounts.replace(customer.getUsername(), customer);
	}

	@Override
	public void removeCustomer(String username) 
	{
		accounts.remove(username);
	}

}
