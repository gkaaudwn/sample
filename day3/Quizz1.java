import java.util.Scanner;   // ���� ����1���� �����ٸ� �۾��������� ���μ����� java.exe�� ����

public class Quizz1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����, ����, ���������� �Է¹޾Ƽ� 
		// ���հ� ����� ����ϱ�
		System.out.print("���� ������ �Է��ϼ���:");
		int kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int math = sc.nextInt();

		int total = kor + eng + math;
		float avg = (float)total/3;
		System.out.println("���� : "+total+"\t��� :"+avg);
	}
}