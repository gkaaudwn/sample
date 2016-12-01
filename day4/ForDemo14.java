import java.util.Scanner;

public class ForDemo14{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int balance = 0;
		for(;;){
				System.out.println("=================================");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("=================================");
				System.out.println();
				System.out.print("선택>");
				int select=sc.nextInt();
				if(select==1){
				System.out.print("예금액>");
				int y=sc.nextInt();
				balance+=y;
				}else if(select==2){
				System.out.print("출금액>");
					
				int c=sc.nextInt();
				balance-=c;
				}else if(select==3){
				System.out.println("잔고>"+(balance));
				}else{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
