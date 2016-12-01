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
		this(no, name, maker, "����ǰ", price, 0.1, false);
		System.out.println("Product(int, string, string, int) is running");
	}

	public Product(int no, String name, String maker, String category, int price) {	// this(int, String, String, String, int)
		
		//this.no = no;
		//this.name = name;
		//this.maker = maker;
		//this.category = category;
		//this.price = price;
		this(no, name, maker, category, price, 0.1, false);	// ������ ���� ���� ������ �ִ� �����ڸ� �������� �ۼ�
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
		System.out.println("��    ȣ : " + no);
		System.out.println("��    �� : " + name);
		System.out.println("�� �� �� : " + maker);
		System.out.println("��    �� : " + category);
		System.out.println("��    �� : " + price);
		System.out.println("�� �� �� : " + discountRate);
		System.out.println("���Ῡ�� : " + isFree);
	}
}