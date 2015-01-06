import java.util.Date;
import java.util.ArrayList;

public final class Order
{
    private int status = 0;
    private String userName;
    private Date dateCreated, dateShipped = null;
    private ArrayList<Item> items;
    
    public Order(String userName, ShoppingCart items)
    {
        this.userName = userName;
        this.items = items.getItems();
        
        dateCreated = new Date(System.currentTimeMillis());
    }
    
    public void shipIt()
    {
        dateShipped = new Date(System.currentTimeMillis());
    }
    
    public boolean isShipped()
    {
    	if(dateShipped != null)
    	{
    		if(dateShipped.getTime() > dateCreated.getTime())
    		{
    			return true;
    		}
    	}
     return false;
    }
    
    public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}

	public String getUserName() {
		return userName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

}