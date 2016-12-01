public class ArrayDemo2 {
	public static void main(String[] args) {
		// 배열 생성하기
		// int[] arr1 = {1,2,4,5,6};	<-- 값을 가지고 있는 배열 생성
		// int[] arr2 = new int[3];		<-- 값 3개를 담을 수 있는 배열 생성
		//								<-- 정수형 배열의 기본값 0으로 채워져 있다.
		// 정수형은 0, 실수형은 0.0, 문자형은 \u0000, 불린형은 flase, 참조형은 null
		int[] numbers1 = new int[3];
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		//System.out.println(numbers1);

		double[] numbers2 = new double[3];
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		//System.out.println(numbers2);

		String[] names = new String[3];
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		//System.out.println(names);

		boolean[] b = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		//System.out.println(a);
	}
}