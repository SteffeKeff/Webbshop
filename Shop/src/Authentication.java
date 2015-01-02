import java.util.HashMap;


public final class Authentication {
	
	private HashMap<String, Account> accounts = new HashMap<String, Account>();
	
	public void addCustomer(String username, String password, String email){
		if(!accounts.containsKey(username)){
			accounts.put(username, new Admin(username, password, email));
		}
	}
	
	public void addAdmin(String username, String password, String email){
		if(!accounts.containsKey(username)){
			//new User
			accounts.put(username, new Admin(username, password, email));
		}
	}
	
	public Account getAccount(String username){
		return accounts.getOrDefault(username, null);
	}
}