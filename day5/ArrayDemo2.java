public class ArrayDemo2 {
	public static void main(String[] args) {
		// �迭 �����ϱ�
		// int[] arr1 = {1,2,4,5,6};	<-- ���� ������ �ִ� �迭 ����
		// int[] arr2 = new int[3];		<-- �� 3���� ���� �� �ִ� �迭 ����
		//								<-- ������ �迭�� �⺻�� 0���� ä���� �ִ�.
		// �������� 0, �Ǽ����� 0.0, �������� \u0000, �Ҹ����� flase, �������� null
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