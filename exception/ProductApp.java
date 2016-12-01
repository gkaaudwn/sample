import java.io.*;

public class ProductApp {
	
	// ��ǰ���� �ؽ�Ʈ �� ���� ���޹޾Ƽ� 
	// �� �߶� Product�� ��Ƽ� ��ȯ�ϴ� �޼ҵ�
	public static Product parseData(String text) {
		Product p = new Product();
		String[] arr = text.split(",");

		
		p.setName(arr[0]);
		p.setMaker(arr[1]);
		p.setPrice(Integer.parseInt(arr[2]));			// ���ڸ� ������ �޾�
		p.setDiscount(Double.parseDouble(arr[3]));		// ���ڸ� �Ǽ��� �޾�

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
			System.out.println("�̸� :" + pr.getName());
			System.out.println("������ :" + pr.getMaker());
			System.out.println("���� :" + pr.getPrice());
			System.out.println("������ :" + pr.getDiscount());
			System.out.println();
		}

	}
}