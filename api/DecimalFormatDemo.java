import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		int number = 123456789;

		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat();
		String text = df.format(number);

		System.out.println(text);

		double rate = 1112.345;
		//String pattern2 = "#,###.##";			// 소수점 2자리까지 표현, 소수점 3자리에서 반올림된다.
		//String pattern2 = "#,###.####";		// #은 빈자리를 채우지 않음
		String pattern2 = "0,000.0000";			// 0은 빈자리를 채움(소수점 5번째 자리에서 반올림 했다는 것을 알 수 있다)
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}
