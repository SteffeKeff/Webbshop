
public interface AccountRepository {
	
	public void addCustomer(String username, String password, String email);
	
	public void addAdmin(String username, String password, String email);
	
	public Account getAccount(String username);
	
	public void updateAccount(String username, String password, String email);
	
	public void removeAccount(String username);
	
}
