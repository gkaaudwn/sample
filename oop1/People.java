public class People {
	// 속성
	// 사원번호
	int num;
	// 이름
	String name;
	// 전화번호
	String phone;
	// 소속부서
	String department;
	// 직위
	String position;
	// 급여
	int wage;

	// 기능
	// 연봉을 계산해서 반환하는 메소드(급여*12)
	public int income () {
		return wage*12;
	}	
	// 사원의 모든 정보를 출력하는 메소드
	public void information () {
		System.out.println("순번:"+ num);
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phone);
		System.out.println("소속부서:"+ department);
		System.out.println("직위:"+ position);
		System.out.println("급여:"+ wage/10000+"만원");
		System.out.println("연봉:"+income()/10000+"만원");
	}
}