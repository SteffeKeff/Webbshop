import java.util.HashMap;

public class InMemoryOrders implements OrderRepository
{
	
	private HashMap<String, Order> orders = new HashMap<String, Order>();
	
	@Override
	public void addOrder(Customer customer) 
	{
		//Will add the order to the system "order"-list
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