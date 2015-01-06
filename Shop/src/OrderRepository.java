import java.util.HashMap;

public interface OrderRepository{
    public void addOrder(Customer customer);
    public Order getOrder(String key);
    public HashMap<String,Order> getAllOrders();    
}