import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		// 연락서 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);

		ContactMgr mgr = new ContactMgr();

		for(;;) {
			System.out.println("1:등록   2: 조회   0:종료");

			System.out.print("메뉴 번호를 입력하세요:");
			int menuNo = sc.nextInt();

			if (menuNo ==1) {
				// 배열에 등록하기
				// mgr 의 addContact (Contact contacts) 메소드에 등록할 Contact 객체 전달
				Contact contact = new Contact();
				System.out.print("번호입력:");
				contact.setNo(sc.nextInt());
				System.out.print("이름입력:");
				contact.setName(sc.next());
				System.out.print("전화번호:");
				contact.setPhone(sc.next());
				System.out.print("이메일:");
				contact.setEmail(sc.next());
				mgr.addContact(contact);


			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표시하기
				// mgr의 displayContact()를 실행시키기
				mgr.displayContact();
				
			} else if (menuNo == 3) {
				break;
			}
		}
		

	}
}