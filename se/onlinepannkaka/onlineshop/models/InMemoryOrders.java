package se.onlinepannkaka.onlineshop.models;
import java.util.HashMap;

import se.onlinepannkaka.onlineshop.Customer;
import se.onlinepannkaka.onlineshop.Order;
import se.onlinepannkaka.onlineshop.repositories.OrderRepository;

public class InMemoryOrders implements OrderRepository
{
	
	private HashMap<String, Order> orders = new HashMap<String, Order>();
	
	@Override
	public void addOrder(Customer customer) 
	{
		orders.put(customer.getUsername().concat(new Integer(customer.getOrders().size()).toString()), customer.getOrder(customer.getOrders().size()-1));
	}

	@Override
	public Order getOrder(String key) 
	{
		return orders.getOrDefault(key, null);
	}

	@Override
	public HashMap<String, Order> getAllOrders() 
	{
		return orders;
	}
	
}