public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "이것이 자바다", "홍길동", "한빛미디어", 35000, "2015-10-10");
		bookCart[1] = new Book(1, "자바 인 액션", "김유신", "한빛미디어", 33000, "2016-05-10");
		bookCart[2] = new Book(1, "스프링 프레임워크", "강감찬", "한빛미디어", 27000, "2013-01-10");
		bookCart[3] = new Book(1, "스프링 시큐리티", "이순신", "한빛미디어", 26000, "2014-04-10");
		bookCart[4] = new Book(1, "자바 웹 프로그래밍", "권률", "한빛미디어", 30000, "2015-11-23");
		
		// 카트에 저장된 모든 책들의 제목을 표시하기
		for(Book b:bookCart) {
			System.out.println(b.getTitle());
		}
		System.out.println("////////////////////////////////////////////////");
		// 카트에 저장된 가격 총합을표시하기
		int total=0;
		for(Book b:bookCart) {
			total +=b.getPrice();
		}
		System.out.println("총 가격:"+total);
		System.out.println("////////////////////////////////////////////////");

		// 카트에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을표시하기(위의 식과는 별개)
		int maxPrice = 0;
		String bookName = null;
		for(Book b : bookCart) {			// class Book타입의 b : bookCart 가 도는 동안
			if(maxPrice < b.getPrice()) {	// maxPrice 보다 b의 getPrice가 크다면
				maxPrice = b.getPrice();
				bookName = b.getTitle();
			}
		}
		//System.out.println("가장 비싼 책: "+bookName+"     가격: "+maxPrice);
		System.out.println("가장 비싼 책: "+bookName+","+"  가격: "+maxPrice);

	}
}