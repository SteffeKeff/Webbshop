import java.util.List;

public interface ShoppingCartRepository {
	
	public void addItem(Item addThis);
	
	public Item getItem(String itemName);
	
	public List<Item> getItems();
	
	public void removeItem(Item removeThis);
	
	public int getSum();
	
	public void updateItem(Item updateThis);
	
}
