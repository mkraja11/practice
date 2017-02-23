
public class PolyTest2 {

	public static void main(String[] args) {
		
		Printable[] prods = new Printable[4];
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		
		Book2 b1 = new Book2();
		Book2 b2 = new Book2();
		
		c1.id = 101;
		c1.make = "Chevy";
		c1.model = "Malibu";
		c1.price = 25000.00;
		
		c2.id = 102;
		c2.make = "Ford";
		c2.model = "Explorer";
		c2.price = 45000.00;
		
		b1.id = 201;
		b1.author = "Deitel";
		b1.title = "Java Programming";
		b1.price = 100.00;
		
		b2.id = 202;
		b2.author = "Deitel";
		b2.title = "C# Programming";
		b2.price = 200.00;
		
		prods[0] = c1;
		prods[1] = c2;
		prods[2] = b1;
		prods[3] = b2;
		
		System.out.println("Before discount: ");
		for(Printable item: prods)
			item.print();
		
		double discount = 0.10;
		double price = 25000.00;
		c1.price = discount * price; 
		
		double discount2 = 0.10;
		double price2 = 45000.00;
		c2.price = discount2 * price2;
		
		double discount3 = 0.25;
		double price3 = 100.00;
		b1.price = discount3 * price3;
		
		double discount4 = 0.25;
		double price4 = 200.00;
		b2.price = discount4 * price4;
		
		System.out.println("\nAfter discount: ");
		for(Printable item: prods)
			item.print();
		}
}
