import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	 public static void main(String[] args) {
		
		Date now = new Date();

		//String pattern = "yyyy.M.d hh:mm:ss";
		//String pattern = "yyyy년 M월 d일 E요일";
		String pattern = "a h시 m분 s초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);
		System.out.println(text);

	 }
}