
public abstract class Item
{
	private String title, category, manufacturer, model, description, img;
	private int price, quantity = 0;
	
	// All of the 'Setters'
	//
	
	public void Item(String category, 
					 String title, 
					 String manufacturer, 
					 String model, 
					 String description, 
					 String img, 
					 int price, 
					 int quantity)
	{
		this.title = title;
		this.category = category;
		this.manufacturer = manufacturer;
		this.model = model;
		this.description = description;
		this.img = img;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setCat(String category){
		this.category = category;
	}
	
	public void setMake(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public void setDesc(String description){
		this.description = description;
	}
	
	public void setImg(String img){
		this.img = img;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	// All of the 'Getters'
	//
	
	@Override
	public String toString(){
		return title + ": " + manufacturer + " " + model;
	}
	
	public String getTitle(){
		return title; 
	}
	
	public String getCat(){
		return category;
	}
	
	public String getMake(){
		return manufacturer;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getDesc(){
		return description;
	}
	
	public String getImg(){
		return img;
	}
	
	public int getPrice(){
		return price;
	}
	
	public int getQuantity(){
		return quantity;
	}
}
