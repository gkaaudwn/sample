import java.util.Scanner;
import java.util.regex.Pattern;


public class Quizz4 {

	public static void main(String[] args) {
	
		// ���̵��Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���)

		// 97 122
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];

		System.out.print("���̵� �Է���: ");
		String userId = sc.next();

		
		// �˻��ϱ�
		

		// ���̵� 6���� �̻����� �˻��ϱ�
		if (userId.length() < 6) {
			System.out.println("6���� �̻� �Է��ض�");
			return;
		}

		// ���̵� ���� �ҹ��ڷ� �����Ǿ����� �˻��ϱ� - boolean
		boolean valid = false;		//Flag���� : ���� ������ Ư�� ���¸� �����ϴ� ����
		/*
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, userId);
*/
		if(!valid) {
			System.out.println("��ȿ���� ����");
		}
	}
	 
}