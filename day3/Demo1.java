public class Demo1 {
	public static void main (String[] args) {
		// �� ������
		int x = 10;
		int y = 10;

		// &&�� �º��� false�̸� �캯�� ������ �ʰ� ��ü ����� false�� ����
		// &�� �º��� false�̴��� �캯�� ���Ѵ�.
		boolean result1 = false && x++ > 10;	// &&�϶� �տ��� false �ϱ� ���� ������ ���� ����
		boolean result2 = false &  x++ > 10;	// &�϶��� �յ� ��� ������ �ϹǷ�
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x:" +x);			// &&�϶� �տ��� false �ϱ� ���� ������ ���� ���� 11���
		System.out.println("y:" +y);			// &�϶��� �յ� ��� ������ �ϹǷ� 10���


	}
}