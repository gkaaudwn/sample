public class Quizz1 {
	public static void main(String[] args) {
		// �迭���� ���� ū ���� ã��

		// ���� ū ���� ���� ����
		int max = 0;

		int[] numbers = {1, 3, 7, 4, 6};

		for (int n : numbers) {
			if (max<n) {
				max = n;
			}
		}
		System.out.println("���� ū ��:" + max);
	}
}