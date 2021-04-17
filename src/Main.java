
public class Main {

	public static void main(String[] args) {
		
		Handphone h = new Handphone(); 
		System.out.println("Brand: " + h.brand);
		System.out.println("Operating System: " + h.operatingSystem); 
		System.out.println("Colour: " + h.colour);
		System.out.println("Storage: " + h.storage + "gb");
		System.out.println("Price: RM" + h.price);
		System.out.println();
		
		Handphone hh = new Handphone("Oppo","Android","BLACK",128,950.00);
		System.out.println("Brand: " + hh.brand);
		System.out.println("Operating System: " + hh.operatingSystem);
		System.out.println("Colour: " + hh.colour);
		System.out.println("Storage: " + hh.storage + "gb");
		System.out.println("Price: RM" + hh.price);

	}

}
