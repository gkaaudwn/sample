public class ProductApp {
	public static void main(String[] args) {
	
	// ��ǰ�� 5�� ��� �迭�� �����ϱ�
	Product[] products = new Product[3];


	// �迭�� ��ǰ 5�� �����ϱ�
	products[0] = new Product(1, "�Ｚ", "�����", 300000, 0.1, true);
	products[1] = new Product(1, "����", "TV", 700000, 0.2, true);
	products[2] = new Product(1, "���н�", "Ű����", 110000, 0.3, false);

	// �迭�� ����� ��ǰ�߿��� �Ǹ����� ��ǰ�� ǥ���ϱ�
		for (Product p : products ) {
			if (p.sell==true) {
				System.out.println("�Ǹ����� ��ǰ:"+p.name);
				//p.info();
			}
		}


	// �迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�
		for (Product p : products ) {
			if (p.price>=10000) {
				System.out.println("10000�� �̻��� ��ǰ:"+p.name);
			}
		}

	// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�
		double total = 0;
		for (Product p : products ) {
			total += p.discount();
			p.info();
			
		}
		System.out.println("��ǰ�� ��ü����:"+(int)total+"��");
		

	}
}