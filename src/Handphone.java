import java.util.Scanner;
public class Handphone {

	Scanner s = new Scanner(System.in);
	
	String brand, operatingSystem, colour;
	int storage; 
	double price;
	
	//default constructor
	Handphone(){
		
		System.out.print("Enter Brand: ");
		this.brand = s.nextLine();
		System.out.print("Enter Operating system: "); 
		this.operatingSystem = s.nextLine();
		System.out.print("Enter Colour: ");
		this.colour = s.nextLine();
		System.out.print("Enter Storage: ");
		this.storage = s.nextInt();
		System.out.print("Enter Price: ");
		this.price = s.nextDouble();
	}
	
	//Parameterized constructor
	Handphone(String b, String oS, String c, int s, double p){
		this.brand=b;
		this.operatingSystem=oS;
		this.colour=c;
		this.storage=s;
		this.price=p;
	}
	
	
}
