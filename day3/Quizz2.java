import java.util.*;
public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ�
		// 100�� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();
		int num100 = number/100;
		int num10 = (number-num100*100)/10;
		int num1 = number-(num100*100)-(num10*10);
		System.out.print("���� �ڸ�: " + num100);
		System.out.print("���� �ڸ�: " + num10);
		System.out.print("���� �ڸ�: " + num1); 
	}
}