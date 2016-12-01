public class Product {
	int no;
	String name;
	String maker;
	int price;
	double discountRate;

	public Product() {}

	public Product(int no, String name, String maker, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
	}

	public void info() {
		System.out.printf("%d %s %s %d %f\n", 
							no, name, maker, price, discountRate);
	}
}