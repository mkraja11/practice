
public class Book2 extends Product2 implements Printable, Discountable{

	public String author;
	public String title;
	public double price;
		
	public void print() {
		System.out.printf("Id: %d, Author: %s, Title: %s, Price: %.2f %n", id, author, title, price);
	}
	
	public void discount(){
	this.price = price * 0.25;
	}
}
