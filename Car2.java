
public class Car2 extends Product2 implements Printable, Discountable {
	
	public String make;
	public String model;
	public double price;
	
	public void print() {
		System.out.printf("Id: %d, Make: %s, Model: %s, Price: %.2f %n", id, make, model, price);
	}
	
	public void discount(){
	this.price = price * 0.10;
	}

}
