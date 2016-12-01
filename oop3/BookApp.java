public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "�̰��� �ڹٴ�", "ȫ�浿", "�Ѻ��̵��", 35000, "2015-10-10");
		bookCart[1] = new Book(1, "�ڹ� �� �׼�", "������", "�Ѻ��̵��", 33000, "2016-05-10");
		bookCart[2] = new Book(1, "������ �����ӿ�ũ", "������", "�Ѻ��̵��", 27000, "2013-01-10");
		bookCart[3] = new Book(1, "������ ��ť��Ƽ", "�̼���", "�Ѻ��̵��", 26000, "2014-04-10");
		bookCart[4] = new Book(1, "�ڹ� �� ���α׷���", "�Ƿ�", "�Ѻ��̵��", 30000, "2015-11-23");
		
		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for(Book b:bookCart) {
			System.out.println(b.getTitle());
		}
		System.out.println("////////////////////////////////////////////////");
		// īƮ�� ����� ���� ������ǥ���ϱ�
		int total=0;
		for(Book b:bookCart) {
			total +=b.getPrice();
		}
		System.out.println("�� ����:"+total);
		System.out.println("////////////////////////////////////////////////");

		// īƮ�� ����� å�߿��� ���� ��� ������ å ����� ������ǥ���ϱ�(���� �İ��� ����)
		int maxPrice = 0;
		String bookName = null;
		for(Book b : bookCart) {			// class BookŸ���� b : bookCart �� ���� ����
			if(maxPrice < b.getPrice()) {	// maxPrice ���� b�� getPrice�� ũ�ٸ�
				maxPrice = b.getPrice();
				bookName = b.getTitle();
			}
		}
		//System.out.println("���� ��� å: "+bookName+"     ����: "+maxPrice);
		System.out.println("���� ��� å: "+bookName+","+"  ����: "+maxPrice);

	}
}