package se.onlinepannkaka.onlineshop.models;
import java.util.ArrayList;

public final class Customer extends Account
{
    private String firstName,
                        lastName,
                        address,
                        mobileNumber;
    private ArrayList<Order> orders = new ArrayList<Order>();
    private ShoppingCart shoppingCart = new ShoppingCart();
    
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
    
    public void addProduct(String product)
    {
    	if(product != null)
    	{
    		try
    		{
    			shoppingCart.addProduct(product);
    		}
    		catch(NullPointerException E)
    		{
    			//E.printStackTrace();
    		};
    		
    	}
    }
    
    public void removeProduct(String product)
    {
    	shoppingCart.removeProduct(product);
    }
    
    public ArrayList<String> getShoppingCart()
    {
        return shoppingCart.getProducts();
    }
    
    public ArrayList<Order> getOrders()
    {
        return orders;
    }
    
    public void addOrder()
    {
    	if(!shoppingCart.getProducts().isEmpty()){
    		orders.add(new Order(super.getUsername(), shoppingCart.getProducts()));
            shoppingCart.clear();
    	}
    }
    
    public String getFirstName() 
    {
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getMobileNumber() 
	{
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}

	public Order getOrder(int index)
    {
		try
		{
			return orders.get(index);
		}catch(IndexOutOfBoundsException E)
		{
			//E.printStackTrace();
		};
		return null;
    }
	
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}
}