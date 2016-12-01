import java.util.*;

public class StringTokenizerDemo {
	public static void main (String[] args) {
		
		String text = "(����=���մ���) ������ ���� = 28�� ������                             ���� ���米����                        ���� ���亻���� ���� ū ������ �� ���� �� �ϳ��� �ٷ� ���ѹα��� �Ǳ� �ñ�� ������ ���̴�.";
/*
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("�ܾ� ����:" + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ����: "+st.countTokens());

		}
*/		
		String[] tokens = text.split(" ");
		System.out.println("�ܾ� ����: "+ tokens.length);
		/*
			StringTokenizer
				- ���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
				- new StringTokenizer(�ؽ�Ʈ);			// �����ڰ� �������� ������ ������ �����ڰ� �ȴ�.
				- new StringTokenizer(�ؽ�Ʈ, ������);

				- boolean hasMoreTokens() : �������� ���� ��ū(���ڿ�)�� �����ϸ� true�� ��ȯ�Ѵ�.
				- String nextToken()	  : ��ū(���ڿ�)�� ������.
		*/
	}
}