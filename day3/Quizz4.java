import java.util.Scanner;

public class Quizz4 {
	public static void main (String [] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int num = sc.nextInt();
		String hangul="";
		int sip= num/10;
		int il= num-sip*10;

		if(sip==1){
			hangul="�Ͻ�";
		}else if(sip==2){
			hangul="�̽�";
		}else if(sip==3){
			hangul="���";
		}else if(sip==4){
			hangul="���";
		}else if(sip==5){
			hangul="����";
		}else if(sip==6){
			hangul="����";
		}else if(sip==7){
			hangul="ĥ��";
		}else if(sip==8){
			hangul="�Ƚ�";
		}else if(sip==9){
			hangul="����";
		}
		if (il==1){
			hangul+="��";
		}else if(il==2){
			hangul+="��";
		}else if(il==3){
			hangul+="��";
		}else if(il==4){
			hangul+="��";
		}else if(il==5){
			hangul+="��";
		}else if(il==6){
			hangul+="��";
		}else if(il==7){
			hangul+="ĥ";
		}else if(il==8){
			hangul+="��";
		}else if(il==9){
			hangul+="��";
		}
		System.out.println(hangul);

	}
}