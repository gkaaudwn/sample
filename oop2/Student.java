public class Student {
	int no;	// �й�
	String name;
	int kor;
	int eng;
	int math;

	// �⺻ ������
	public Student() {}

	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
		
	}

	// ������ ��ȯ�ϴ� ��� - �޼ҵ�� total
	public int total() {
		int total = kor + eng + math;
		return total;
	}

	// ����� ��ȯ�ϴ� ��� - �޼ҵ�� avg
	public double avg() {
		double avg = total()/3;
		return avg;
	}

	// �л� ������ ����ϴ� ���(������ ��յ� ����) - �޼ҵ�� info
	public void info() {
		System.out.println("�й�:"+ no);
		System.out.println("�̸�:"+ name);
		System.out.println("����:"+ kor);
		System.out.println("����:"+ eng);
		System.out.println("����:"+ math);
		System.out.println("����:"+ total());
		System.out.println("���:"+ avg());
		System.out.println("--------------------------------------------------");
		
	}
}