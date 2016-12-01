import java.util.Scanner;

public class ContactApp2{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Tel[] tels = new Tel[50];
		int position = 0;

		for (;;) {
			System.out.println("1.이름등록 2.전화번호등록 3.주소등록/수정 4.조회 0.종료");
			System.out.print("메뉴를 선택하세요");
			int no = sc.nextInt();
			if(no == 1) {
				// 이름을 입력받아서 Contact에 저장합니다.
				System.out.print("이    름:  ");
				contact.setName(sc.next());
				
			} else if(no == 2) {
				// 전화번호 정보를 입력받아서 Contact에 저장합니다
				// Tel객체 생성 -> 값 입력받아서 채우고 -> Contact의 addTel(Tel tel)에게 Tel 객체 전달해서 배열에 담기
				Tel tel = new Tel();
				System.out.print("전화타입:  ");
				tel.setType(sc.next());
				System.out.print("전화번호:  ");
				tel.setNumber(sc.next());

				contact.addTel(tel);
				
			} else if(no == 3) {
				// 주소 정보를 입력받아서 Contact에 저장합니다
				// Address객체 생성 -> 값 입력받아서 채우고 -> Contact의 setter 이용해서 저장
				Address adr = new Address();
				System.out.print("시,도 입력:  ");
				adr.setSido(sc.next());
				System.out.print("구,군 입력:  ");
				adr.setGugun(sc.next());
				System.out.print("나머지 주소 입력:  ");
				adr.setDetail(sc.next());

				contact.setAddress(adr);


			} else if(no == 4) {
				// 연락처 정보를 화면에 표시합니다.
				

				contact.info();
			} else if(no == 0) {
				// 프로그램을 종료합니다.
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}

	}
}

/*
Database를 대상으로 하는 작업
	Create		- 새 데이터 저장
	Retrieve	- 데이터 조회	
	Update		- 데이터 수정
	Delete		- 데이터 삭제

*/