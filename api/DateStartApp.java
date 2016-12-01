import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class DateStartApp {
	public static void main(String[] args) throws ParseException {	// String[] args는 명령행인자
		/*
		Scanner sc = new Scanner(System.in);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		ParsePosition pos = new ParsePosition(0);
		System.out.print("원하는 날 입력 : ");
		String dday = sc.nextLine();
		Date date = sdf.parse(dday,pos);
		check(date.getTime());
		*/

		System.out.println("args[0]" + args[0]);	//java DateStartApp 2011-11-12로 컴파일 하면 args[0]에 2011-11-12 args[1]에 100이 들어가 있음
		System.out.println("args[1]" + args[1]);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = sdf.parse(args[0]);	// 날짜를 입력받아
		long time = day.getTime();		// 그걸 숫자로 변환해

		long period = (long)Integer.parseInt(args[1]) * 60*60*24*1000;	// 그리고 입력한 ???일에 하루시간을 곱해

		day.setTime(time + period);

		System.out.println("["+args[1]+"]째 되는 날 : " + sdf.format(day));
	}
	public static void check(long time){
		/*
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		final long DAY = 1000*60*60*24;		
		for(int i = 100 ; i <=1000 ; i = i+100 ){
			long day = time + (long)(i*DAY);
			String daytxt = sdf.format(day); 
			System.out.printf("%d일이 되는 날 : %s\n",i,daytxt);
		}
		*/
	}
}