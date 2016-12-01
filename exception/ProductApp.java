import java.io.*;

public class ProductApp {
	
	// 상품정보 텍스트 한 줄을 전달받아서 
	// 잘 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseData(String text) {
		Product p = new Product();
		String[] arr = text.split(",");

		
		p.setName(arr[0]);
		p.setMaker(arr[1]);
		p.setPrice(Integer.parseInt(arr[2]));			// 문자를 정수로 받아
		p.setDiscount(Double.parseDouble(arr[3]));		// 문자를 실수로 받아

		return p;

	}
	
	public static void main(String[] args) throws Exception {
		Product[] products = new Product[4];

		BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
		/*
		String text1 = reader.readLine();
		String text2 = reader.readLine();
		String text3 = reader.readLine();
		String text4 = reader.readLine();

		products[0] = parseData(text1);
		products[1] = parseData(text2);
		products[2] = parseData(text3);
		products[3] = parseData(text4);
		*/

		products[0] = parseData(reader.readLine());
		products[1] = parseData(reader.readLine());
		products[2] = parseData(reader.readLine());
		products[3] = parseData(reader.readLine());

		for(Product pr : products) {
			System.out.println("이름 :" + pr.getName());
			System.out.println("제조사 :" + pr.getMaker());
			System.out.println("가격 :" + pr.getPrice());
			System.out.println("할인율 :" + pr.getDiscount());
			System.out.println();
		}

	}
}