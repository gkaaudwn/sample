public class ProductApp {
	public static void main(String[] args) {
		Product p1 = new Product(10, "�����е�", "����", 1000000, 0.1);
		Product p2 = new Product(11, "��������", "�Ｚ", 800000, 0.1);
		Product p3 = new Product(12, "������", "����", 900000, 0);
		
		
		p1.info();
		p2.info();
		p3.info();
	}
}