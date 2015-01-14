package se.onlinepannkaka.onlineshop;
 
import se.onlinepannkaka.onlineshop.models.Customer;
import se.onlinepannkaka.onlineshop.models.InMemoryCustomers;
import se.onlinepannkaka.onlineshop.models.InMemoryOrders;
import se.onlinepannkaka.onlineshop.models.InMemoryProducts;
import se.onlinepannkaka.onlineshop.models.Product;
 
 
public class Main
{
 
        public static void main(String[] args)
        {
               
                ShopService ss = new ShopService(new InMemoryCustomers(),new InMemoryProducts(), new InMemoryOrders());
 
                ss.addCustomer(new Customer("Steffe", "Keff", "sdgkeff@gmail.com", "Stefan", "De Geer", "Sommarbo 228", "0768646474"));
                ss.addCustomer(new Customer("Be", "oz", "beoz@hotmail.com", "be", "oz", "Nynäsvägen 1", "070123456789"));
               
                ss.addProduct(new Product("Klassisk pannkaka", "Pannkakor" , "Stefan", "Vår klassiska och mycket utsökta pannkaka", "klassiskPannkaka.png", 10.90, 60));
                ss.addProduct(new Product("Amerikansk pannkaka", "Pannkakor" , "Erik", "En tjockare variant än den klassiska pannkakan men otroligt god och passar till sirap", "amerikanskPannkaka.png", 13.90, 40));
                ss.addProduct(new Product("Belgisk våffla", "Våfflor", "Osama", "Den belgiska våfflan är lite tjock och mycket frasig", "belgiskVaffla.png", 12.90, 50));
                System.out.println("alla produkter: " + ss.getProducts());
               
                System.out.println();
                System.out.println("Varukorg1: "+ss.getCustomer("Steffe").getShoppingCart());
                ss.getCustomer("Steffe").addProduct("Klassisk pannkaka");
                System.out.println("Varukorg2: " + ss.getCustomer("Steffe").getShoppingCart());
 
                ss.getCustomer("Be").addProduct("Belgisk våffla");
               
                System.out.println();
                System.out.println(ss.getCustomer("Be").getShoppingCart());
                System.out.println(ss.getCustomer("Be").getOrders());
               
                ss.addOrder("Be");
                System.out.println("-----");
                System.out.println(ss.getOrders());
 
                ss.getCustomer("Be").getOrder(0).shipIt();
               
                System.out.println(ss.getOrders());
               
                System.out.println("-----");
               
                ss.getCustomer("Be").addProduct("Klassisk pannkaka");
                ss.getCustomer("Be").addProduct("Amerikansk pannkaka");
                ss.addOrder("Be");
                System.out.println(ss.getOrders());
                ss.addOrder("Steffe");
                System.out.println(ss.getOrders());
                
        }
 
}