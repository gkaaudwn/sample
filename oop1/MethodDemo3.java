import java.util.Random;
import java.util.Date;
public class MethodDemo3 {

	// 난수를 발생시키는메소드 만들기
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100);
		
		return number;	// return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.(void인경우는 반환값이 없으므로 return 키워드를 쓰지 않아도 된다.)
		} 
	// 오늘 날짜를 반환하는 메소드 만들기
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