public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public
	
	// �迭 �̵���Ű�� arr1
	// arr1�迭���� ������ ��ȣ�� ã�Ƽ� �� �ڷ� ������ 
	public int[] move(int no) {
		int[] result = new int[arr1.length];
		
		// ������ ���纻�� ������
		int temp = arr1[no-1];
		
		for (int i=no; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		// ���� ó�� ���������� ���� �̸� �����س���
		int number = arr1[no-1];

		// �迭�� ���� �� ĭ�� ������ �̵���Ű��
		for (int i=no; i<arr1.length; i++) {
			result[i-1] = arr1[i];
		}
		// �� ������ ĭ�� �Ʊ� �����صξ��� ���� ����
		result[result.length-1] = number;
		System.out.println(java.util.Arrays.toString(result));

		return result;
	
	}

	
	
/*

	public int[] shift(int begin, int length) {
	
	}

	// �迭 �����ϱ� arr2
	// arr2�迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
		
	}

	// �迭 �߶󳻱� arr3
	// arr2�迭�� ������ ��ġ���� ������ ��ġ���� ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin, int end) {
	
	}
*/
	public static void main(String[] args) {
		ArrayService s = new ArrayService();
		s.move(3);
	} 
}