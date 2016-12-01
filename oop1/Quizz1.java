public class Quizz1 {
	
	// 배열을 전달받아서 그 배열의 가장 큰 값을 반환하는 메소드
	public static int max(int[] numbers) {
		int maxNumber = 0;

		for (int num : numbers) {
			if(num > maxNumber) {
				maxNumber = num;
			}
		}

		return maxNumber;
	}
	
	
	// 배열과 숫자를 전달받아서 그 숫자가 배열에 포함되어 있는지 여부를 반환하는 메소드
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
		System.out.println("최대값:"+ maxValue1);

		int[] arr2 = {-1, -449, 10, 56, 7, 23, 9};
		int maxValue2 = max(arr2);
		System.out.println("최대값:"+ maxValue2);

		boolean exist = contains(arr2, 10);
		System.out.println("포함하고 있나?" + exist);

	}
}