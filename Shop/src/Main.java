
public class Main {

	public static void main(String[] args) {
		Authentication a = new Authentication();
		
		a.addAdmin("SteffeÄ", "Keff", "Mail1");
		a.addAdmin("Steffe2", "Keff", "Mail2");
		
		System.out.println(a.getAccount("Steffe2"));
		System.out.println(a.getAccount("Steffe2").getEmail());

	}

}