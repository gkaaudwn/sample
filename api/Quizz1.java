import java.util.Scanner;

public class Quizz1 {
	public static void main(String[] args) {
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		// ��> eungsulee@hanmail.net ----> eungsulee

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸����� �Է��ϼ���: ");
		
		
		//indexOf(), substring()

		String email = sc.next();
		/*
		int i = email.indexOf("@");
		String id = email.substring(0,i);
		System.out.println("���̵�: "+id);
		*/

		String[] arr = email.split("@");
		System.out.println("���̵�: "+ arr[0]);
	}
}