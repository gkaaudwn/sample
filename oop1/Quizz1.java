public class Quizz1 {
	
	// �迭�� ���޹޾Ƽ� �� �迭�� ���� ū ���� ��ȯ�ϴ� �޼ҵ�
	public static int max(int[] numbers) {
		int maxNumber = 0;

		for (int num : numbers) {
			if(num > maxNumber) {
				maxNumber = num;
			}
		}

		return maxNumber;
	}
	
	
	// �迭�� ���ڸ� ���޹޾Ƽ� �� ���ڰ� �迭�� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public static boolean contains(int[] numbers, int num) {
	
		boolean isExist = false;

		for (int no : numbers) {
			if (no == num) {
				isExist = true;
			}
		}

		return isExist;
	}

	
	public static void main(String[] args) {
	
		int[] arr1 = {1, 4, 2, 56, 7, 23, 9};
		int maxValue1 = max(arr1);
		System.out.println("�ִ밪:"+ maxValue1);

		int[] arr2 = {-1, -449, 10, 56, 7, 23, 9};
		int maxValue2 = max(arr2);
		System.out.println("�ִ밪:"+ maxValue2);

		boolean exist = contains(arr2, 10);
		System.out.println("�����ϰ� �ֳ�?" + exist);

	}
}