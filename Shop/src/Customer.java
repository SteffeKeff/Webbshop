import java.util.ArrayList;

public final class Customer extends Account
{
    private String firstName,
                        lastName,
                        address,
                        mobileNumber;
    private ArrayList<Order> orders;
    private ShoppingCart shoppingCart;
    
    public Customer(
                    String userName,
                    String password,
                    String email,
                    String firstName,
                    String lastName,
                    String address,
                    String mobileNumber
                    )
    {
        super(userName, password, email); 
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }
    
    public ShoppingCart getShoppingCart()
    {
        return shoppingCart;
    }
    
    public ArrayList<Order> getOrders()
    {
        return orders;
    }
    
    public void addOrder(Order order)
    {
        this.orders.add(order);
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Order getOrder(int index)
    {
        return orders.get(index);
    }
}