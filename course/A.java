package course;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class A {
	public static void main(String[] args) {
		Date now = new Date();
		//String nowDate1 = now.toString();
		SimpleDateFormat sd = new SimpleDateFormat("yy");
		String nowDate2 = sd.format(now);
		System.out.println(nowDate2);
		
		Random r = new Random();
		System.out.println(r.hashCode());
	}

	
}
