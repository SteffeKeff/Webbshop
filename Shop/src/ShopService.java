import java.util.HashMap;


public class ShopService implements ShoppingCartRepository, AccountRepository{
	
	private HashMap<String, Account> accounts = new HashMap<String, Account>();
	private HashMap<String, Item> items = new HashMap<String, Item>();
	
	@Override
	public void addCustomer(String username, String password, String email) {
		if(!accounts.containsKey(username)){
			accounts.put(username, new Admin(username, password, email));
		}
	}

	@Override
	public void addAdmin(String username, String password, String email) {
		if(!accounts.containsKey(username)){
			accounts.put(username, new Admin(username, password, email));
		}
	}

	@Override
	public Account getAccount(String username) {
		return accounts.getOrDefault(username, null);
	}

	@Override
	public void updateAccount(String username, String password, String email) {
		//new user?
		accounts.replace(username, new Admin(username,password,email));
	}

	@Override
	public void removeAccount(String username) {
		accounts.remove(username);
	}
	
	@Override
	public void addItem(Item addThis){
		if(!items.containsKey(addThis)){
			items.put(addThis.title, addThis);
		}
	}

	@Override
	public Item getItem(String itemName) {
		return items.getOrDefault(itemName,null);
	}

	@Override
	public HashMap<String,Item> getItems() {
		return items;
	}

	@Override
	public void removeItem(Item removeThis) {
		items.remove(removeThis);
	}

	@Override
	public int getSum() {
		//Returnerar totala summan för varorna i kundvagnen.
		return items.values().iterator().next().price;
	}

	@Override
	public void updateItem(String itemName, Item updateThis) {
		items.replace(itemName, updateThis);
	}
	
}