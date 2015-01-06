import java.util.HashMap;


public class ShopService implements ProductRepository, AccountRepository{
	
	private HashMap<String, Account> accounts = new HashMap<String, Account>();
	private HashMap<String, Item> products = new HashMap<String, Item>();
	
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
		if(!products.containsKey(addThis)){
			products.put(addThis.title, addThis);
		}
	}

	@Override
	public Item getItem(String itemName) {
		return products.getOrDefault(itemName,null);
	}

	@Override
	public HashMap<String,Item> getItems() {
		return products;
	}

	@Override
	public void removeItem(Item removeThis) {
		products.remove(removeThis);
	}

	@Override
	public int getSum() {
		//Returnerar totala summan för varorna i kundvagnen.
		return products.values().iterator().next().price;
	}

	@Override
	public void updateItem(String itemName, Item updateThis) {
		products.replace(itemName, updateThis);
	}
	
}