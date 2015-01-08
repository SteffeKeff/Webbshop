import java.util.Date;


public class Main 
{

	public static void main(String[] args) 
	{
		
		ShopService ss = new ShopService(new InMemoryCustomers(),new InMemoryProducts(), new InMemoryOrders());

		ss.addCustomer(new Customer("Steffe", "Keff", "totepote@live.se", "Stefan", "De Geer", "Sommarbo 228", "0768646474"));
		ss.addCustomer(new Customer("Be", "oz", "beoz@hotmail.com", "be", "oz", "Nynäsvägen 1", "070123456789"));
		ss.addProduct(new Product("Cars", "BMW", "BMW AB", "320D", "Very good car!", "PNG1", 100, 10));
		ss.addProduct(new Product("Knappar", "Bra knapp", "Knapparna AB", "SuperKnappen", "Extremt bra knapp!", "PNG2", 10, 1000));
		System.out.println(ss.getProducts());
		
		System.out.println();
		System.out.println("Varukorg1: "+ss.getCustomer("Steffe").getShoppingCart());
		ss.getCustomer("Steffe").addProduct(ss.getProduct("BMW"));
		System.out.println("Varukorg2: " + ss.getCustomer("Steffe").getShoppingCart());

		System.out.println();
		ss.getCustomer("Be").addProduct(ss.getProduct("Bra knapp"));
		System.out.println(ss.getCustomer("Be").getShoppingCart());
		System.out.println(ss.getCustomer("Be").getOrders());
		
		System.out.println("-----");
		ss.addOrder("Be");
		System.out.println(ss.getAllOrders());

		ss.getCustomer("Be").getOrder(0).setDateShipped(new Date(System.currentTimeMillis()));
		
		System.out.println("-----");
		ss.addOrder("Be");
		System.out.println(ss.getAllOrders());
		
	}

}