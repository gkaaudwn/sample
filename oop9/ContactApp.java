public class ContactApp {
	public static void main(String[] args) {
		
		Contact contact = new Contact();	// 주소록정보(이름, 여러개의 전화번호, 주소)를 저장하는 객체 생성

		// 이름 정보 저장
		String name = "홍길동";
		contact.setName(name);

		// 전화번호 정보 저장
		Tel[] phones = new Tel[10];

		Tel tel1 = new Tel();
		tel1.setType("폰");
		tel1.setNumber("010-2222-3333");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel1.setType("직장");
		tel1.setNumber("02-111-1111");
		phones[1] = tel2;

		contact.setTels(phones);

		// 주소정보 저장
		Address addr = new Address();
		addr.setSido("서울특별시");
		addr.setGugun("종로구");
		addr.setDetail("봉익동 디아망빌딩 401호");

		contact.setAddress(addr);

	}
}