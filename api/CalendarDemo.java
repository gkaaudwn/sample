import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		
		Calendar nowTime = Calendar.getInstance();
		//System.out.println(now);

		int year = nowTime.get(Calendar.YEAR);
		int month = nowTime.get(Calendar.MONTH)+1;
		int day = nowTime.get(Calendar.DAY_OF_MONTH);
		System.out.printf("%d�� %d�� %d��\n",year, month, day);
		//System.out.println("year: "+year);

		Calendar birth = Calendar.getInstance();
		birth.set(1988,9,9);
		long birthTime = birth.getTimeInMillis();
		//System.out.println(birth);

		long lifeTime = (nowTime.getTimeInMillis() - birthTime)/1000/(60*60*24);
		System.out.println("���ݱ��� ��ƿ� ��¥: "+lifeTime+"��");
	}
}