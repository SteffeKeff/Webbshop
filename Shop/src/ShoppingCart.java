import java.util.ArrayList;


public class ShoppingCart
{
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item addThis){
		items.add(addThis);
	}
	
	public void removeItem(Item removeThis){
		
	}
	
	public ArrayList<Item> getItems(){
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
		String str;
		for(Item item: items){
			str.concat(item.getTitle());
			str.concat(", ");
		};
		str.concat(". With the sum of: " + sum);
		
		return str;
	}
}
