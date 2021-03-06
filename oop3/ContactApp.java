import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// 연락서 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for(;;) {
			System.out.println("1:등록   2: 조회   0:종료");

			System.out.print("메뉴 번호를 입력하세요:");
			int menuNo = sc.nextInt();

			if (menuNo ==1) {
				contacts[currentPosition] = new Contact();
				// 배열에 등록하기
				// 배열에 currentPosition이 가르키는 위치에 Contact를 저장하고
				// currentPosition의 값을 1증가시킨다
				System.out.print("번    호:  ");
				contacts[currentPosition].setNo(sc.nextInt());

				System.out.print("이    름:  ");
				contacts[currentPosition].setName(sc.next());

				System.out.print("전화번호:  ");
				contacts[currentPosition].setPhone(sc.next());

				System.out.print("이 메 일:  ");
				contacts[currentPosition].setEmail(sc.next());

				currentPosition++;

			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표시하기 (enhanced for문 사용하지 말고)
				// 꺼냈는데 null이면 break
				// 배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복해서 출력
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];

					System.out.printf("%d %s %s %s\n", c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}
				

			} else if (menuNo == 3) {
				break;
			}
		}
		

	}
}