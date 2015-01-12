package se.onlinepannkaka.onlineshop;
import java.util.Date;
 
import se.onlinepannkaka.onlineshop.models.InMemoryCustomers;
import se.onlinepannkaka.onlineshop.models.InMemoryOrders;
import se.onlinepannkaka.onlineshop.models.InMemoryProducts;
 
 
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
                System.out.println(ss.getProducts());
               
                System.out.println();
                System.out.println("Varukorg1: "+ss.getCustomer("Steffe").getShoppingCart());
                ss.getCustomer("Steffe").addProduct(ss.getProduct("Klassisk pannkaka"));
                System.out.println("Varukorg2: " + ss.getCustomer("Steffe").getShoppingCart());
 
                ss.getCustomer("Be").addProduct(ss.getProduct("Belgisk våffla"));
               
                System.out.println();
                System.out.println(ss.getCustomer("Be").getShoppingCart());
                System.out.println(ss.getCustomer("Be").getOrders());
               
                ss.addOrder("Be");
                System.out.println("-----");
                System.out.println(ss.getAllOrders());
 
                ss.getCustomer("Be").getOrder(0).shipIt();
               
                ss.addOrder("Be");
                System.out.println("-----");
                System.out.println(ss.getAllOrders());
               
               
                System.out.println("-----");
                System.out.println(ss.getCustomer("Be").getShoppingCart());
               
                ss.getCustomer("Be").addProduct(ss.getProduct("Klassisk pannkaka"));
                ss.getCustomer("Be").addProduct(ss.getProduct("Amerikansk pannkaka"));
                System.out.println(ss.getCustomer("Be").getShoppingCart());
        }
 
}