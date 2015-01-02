import java.util.ArrayList;
import java.util.List;


public abstract class ShoppingCart
{
	List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item addThis){
		
	}
	
	public void removeItem(Item removeThis){
		
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public int getSum(){
		int sum = 0;
		return sum;
	}
	
	public String toString(){
		return "";
	}
}
