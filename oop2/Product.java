public class Product {
	
	// 속성
	// 상품번호, 제조사, 상품명, 가격, 할인율(실수), 판매여부, 
	int no;
	String maker;
	String name;
	int price;
	double discountPoint;
	boolean sell;

	// 생성자
	//		기본생성자, 매개변수 있는 생성자 5개
	public Product () {}

	public Product (int a, String b, String c, int d, double e, boolean f) {
		no = a;
		maker = b;
		name = c;
		price = d;
		discountPoint = e;
		sell = f;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getMaker() {
		return maker;
	}

	public int getPrice() {
		return price;
	}

	public double getDiscountPint() {
		return discountPoint;
	}

	public boolean getSell() {
		return sell;
	}

	public double getDiscountPrice() {
		return (int) (price * (1-discountPoint));
	}

	// 기능
	// 할인된 가격을 반환하는 메소드(가격은 정수)
	public double discount() {
		double discount = price - price*discountPoint;
		return discount;
	}
	// 상품정보를 모두 출력하는 메소드 (할인가 포함)
	public void info () {
		System.out.println("상품번호:"+no);
		System.out.println("상품명:"+maker);
		System.out.println("제조사:"+name);
		System.out.println("가격:"+price);
		System.out.println("할인율:"+discountPoint*100+"%");
		System.out.println("할인가:"+(int)discount());
		System.out.println("판매여부:"+sell);
	}

}