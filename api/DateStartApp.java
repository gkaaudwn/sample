import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class DateStartApp {
	public static void main(String[] args) throws ParseException {	// String[] args�� ���������
		/*
		Scanner sc = new Scanner(System.in);
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		ParsePosition pos = new ParsePosition(0);
		System.out.print("���ϴ� �� �Է� : ");
		String dday = sc.nextLine();
		Date date = sdf.parse(dday,pos);
		check(date.getTime());
		*/

		System.out.println("args[0]" + args[0]);	//java DateStartApp 2011-11-12�� ������ �ϸ� args[0]�� 2011-11-12 args[1]�� 100�� �� ����
		System.out.println("args[1]" + args[1]);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = sdf.parse(args[0]);	// ��¥�� �Է¹޾�
		long time = day.getTime();		// �װ� ���ڷ� ��ȯ��

		long period = (long)Integer.parseInt(args[1]) * 60*60*24*1000;	// �׸��� �Է��� ???�Ͽ� �Ϸ�ð��� ����

		day.setTime(time + period);

		System.out.println("["+args[1]+"]° �Ǵ� �� : " + sdf.format(day));
	}
	public static void check(long time){
		/*
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		final long DAY = 1000*60*60*24;		
		for(int i = 100 ; i <=1000 ; i = i+100 ){
			long day = time + (long)(i*DAY);
			String daytxt = sdf.format(day); 
			System.out.printf("%d���� �Ǵ� �� : %s\n",i,daytxt);
		}
		*/
	}
}