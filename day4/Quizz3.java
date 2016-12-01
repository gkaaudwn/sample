import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		for(;;) {
			System.out.println("1.입금2.출금3.조회0.종료");

			System.out.println("번호를 선택하세요");
			int num = sc.nextInt();

			if(num == 1){
				System.out.println("금액을 입력하세요:");
				int in = sc.nextInt();
				balance += in;
				System.out.println("잔액은:"+balance+"입니다");

			} else if(num == 2){
				System.out.println("금액을 입력하세요:");
				int out = sc.nextInt();
				
				if(balance < out) {
					System.out.println("꺼져");
				} else {
					balance -= out;
					System.out.println("잔액은:"+balance+"입니다");
				}

			} else if(num == 3) {
				System.out.println("잔액은"+balance+"입니다");

			} else if(num == 0) {
				break;
			}
		}
		System.out.println("종료합니다");
	}
}