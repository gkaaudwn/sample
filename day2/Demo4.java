public class Demo4 {
	public static void main(String[] args) {
		// ���� Ÿ�� - char �� ���ڸ������ϴ� �ڷ���

		char c1 = 'A';
		char c2 = 65;	//0041 = 0*16^3 + 0*16^2 + 4*16^1 + 1*16^0 = 65
		char c3 = '\u0041';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//char c4 = 'AB'; // ��� (���� �ΰ��� ������ ������.)
	}
}