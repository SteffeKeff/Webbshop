package se.onlinepannkaka.onlineshop.repositories;
import java.util.HashMap;

import se.onlinepannkaka.onlineshop.Customer;
import se.onlinepannkaka.onlineshop.Order;

public interface OrderRepository
{
    public void addOrder(Customer customer);
    public Order getOrder(String key);
    public HashMap<String,Order> getAllOrders();
}