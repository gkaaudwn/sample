public class MemberServiceApp {
	public static void main(String[] args) {
	
		/*
			이름 : "홍길동"
			아이디 : "hong"
			비밀번호 : "1234"
			나이 : 30
			정보를 가진 Member객체를 담고 있는 MemberService객체 생성하기
		*/

		Member m = new Member();

		m.setName("홍길동");
		m.setId("hong");
		m.setPassword("1234");
		m.setAge(30);

		MemberService service = new MemberService(m);	// 위의 정보m을 Memberservice에 담기

		// MemberService에 정의된 login기능 사용해보기
		//System.out.println(service.login("hongg", "12344"));
		//System.out.println(service.login("hong", "1234"));
		service.login("hong", "1234");
		System.out.println(service.isAuth());

		service.logout();
		System.out.println(service.isAuth());

		
	}
}