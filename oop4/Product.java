public class  Product {
	private int no;
	private String name;
	private String maker;
	private String category;
	private int price;
	private double discountRate;
	private boolean isFree;

	public Product () {}	// this()

	public Product(int no, String name, String maker, int price) {
		this(no, name, maker, "새제품", price, 0.1, false);
		System.out.println("Product(int, string, string, int) is running");
	}

	public Product(int no, String name, String maker, String category, int price) {	// this(int, String, String, String, int)
		
		//this.no = no;
		//this.name = name;
		//this.maker = maker;
		//this.category = category;
		//this.price = price;
		this(no, name, maker, category, price, 0.1, false);	// 갯수를 가장 많이 가지고 있는 생성자를 기준으로 작성
		System.out.println("Product(int, string, string, string, int) is running");
	}

	public Product(int no, String name, String maker, String category, int price, double discountRate, boolean isFree) {	// this(int, String, String, String, int, double, boolean)
		
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.discountRate = discountRate;
		this.isFree = isFree;
		System.out.println("Product(int, string, string, string, int, double, boolean) is running");
	}

	public void displayInfo() {
		System.out.println("번    호 : " + no);
		System.out.println("이    름 : " + name);
		System.out.println("제 조 사 : " + maker);
		System.out.println("종    류 : " + category);
		System.out.println("가    격 : " + price);
		System.out.println("할 인 율 : " + discountRate);
		System.out.println("무료여부 : " + isFree);
	}
}