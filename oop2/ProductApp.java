public class ProductApp {
	public static void main(String[] args) {
	
	// 상품을 5개 담는 배열을 정의하기
	Product[] products = new Product[3];


	// 배열에 상품 5개 저장하기
	products[0] = new Product(1, "삼성", "모니터", 300000, 0.1, true);
	products[1] = new Product(1, "엘지", "TV", 700000, 0.2, true);
	products[2] = new Product(1, "제닉스", "키보드", 110000, 0.3, false);

	// 배열에 저장된 상품중에서 판매중인 상품만 표시하기
		for (Product p : products ) {
			if (p.sell==true) {
				System.out.println("판매중인 상품:"+p.name);
				//p.info();
			}
		}


	// 배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기
		for (Product p : products ) {
			if (p.price>=10000) {
				System.out.println("10000원 이상인 상품:"+p.name);
			}
		}

	// 배열에 저장된 상품의 전체 가격을 표시하기
		double total = 0;
		for (Product p : products ) {
			total += p.discount();
			p.info();
			
		}
		System.out.println("상품의 전체가격:"+(int)total+"원");
		

	}
}