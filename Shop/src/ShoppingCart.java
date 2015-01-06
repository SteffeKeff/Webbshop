import java.util.ArrayList;
import java.util.List;


public abstract class ShoppingCart
{
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item addThis){
		items.add(addThis);
	}
	
	public void removeItem(Item removeThis){
		
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public int getSum(){
		int sum = 0;
		for(Item item: items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
