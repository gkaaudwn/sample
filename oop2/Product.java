public class Product {
	
	// �Ӽ�
	// ��ǰ��ȣ, ������, ��ǰ��, ����, ������(�Ǽ�), �Ǹſ���, 
	int no;
	String maker;
	String name;
	int price;
	double discountPoint;
	boolean sell;

	// ������
	//		�⺻������, �Ű����� �ִ� ������ 5��
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

	// ���
	// ���ε� ������ ��ȯ�ϴ� �޼ҵ�(������ ����)
	public double discount() {
		double discount = price - price*discountPoint;
		return discount;
	}
	// ��ǰ������ ��� ����ϴ� �޼ҵ� (���ΰ� ����)
	public void info () {
		System.out.println("��ǰ��ȣ:"+no);
		System.out.println("��ǰ��:"+maker);
		System.out.println("������:"+name);
		System.out.println("����:"+price);
		System.out.println("������:"+discountPoint*100+"%");
		System.out.println("���ΰ�:"+(int)discount());
		System.out.println("�Ǹſ���:"+sell);
	}

}