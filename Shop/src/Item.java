
public abstract class Item
{
	private String title, category, manufacturer, model, description, img;
	private int price, quantity = 0;
	
	// All of the 'Setters'
	//
	
	@Override
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
	
	public int setPrice(int price){
		this.price = price;
	}
	
	public int setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	// All of the 'Getters'
	//
	
	@Override
	public String toString(){
		return title + ": " + manufacturer + " " + model;
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
