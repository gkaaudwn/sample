import java.util.Random;
import java.util.Date;
public class MethodDemo3 {

	// ������ �߻���Ű�¸޼ҵ� �����
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100);
		
		return number;	// return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.(void�ΰ��� ��ȯ���� �����Ƿ� return Ű���带 ���� �ʾƵ� �ȴ�.)
		} 
	// ���� ��¥�� ��ȯ�ϴ� �޼ҵ� �����
	public static String getCurrentDate() {
		Date now = new Date();
		String Str = now.toString();

		return Str;
	}





	public static void a() {
	
	}

	public static void main (String[] args) {
		int x = random();
		System.out.println(x);
		
		System.out.println(random());
		System.out.println(random() * 100);

		int y = random() * 1000;
		System.out.println(y);

		String d = getCurrentDate();
		System.out.println(d);
		
	}
}