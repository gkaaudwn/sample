public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new Product(10, "아이패드", "애플", 1000000, 0.1);
		Product p2 = new Product(11, "갤럭시탭", "삼성", 800000, 0.1);
		Product p3 = new Product(12, "아이폰", "애플", 900000, 0);
		
		
		p1.info();
		p2.info();
		p3.info();
	}
}