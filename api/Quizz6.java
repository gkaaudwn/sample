public class Quizz6 {

	public static class Employee {
	
		private String name;
		private String dept;
		private String position;
		private int salary;

		public Employee() {}

		public Employee(String name, String dept, String position, int salary) {
			this.name = name;
			this.dept = dept;
			this.position = position;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
	
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

		public void info() {
			System.out.println("#### 직원 정보 ####");
			System.out.println("이름: "+name);
			System.out.println("부서: "+dept);
			System.out.println("직위: "+position);
			System.out.println("급여: "+salary+"만원");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		/*
			1. 이름, 부서, 직위, 급여를담을 수 있는 Employee 클래스 정의하기
				(필드 정의, 기본생성자, getter/setter)
			
			2. ^를 기준으로 문자열 잘라서 배열에 담기
				3. 배열에 사원정보를 하나씩 추출해서 , 로 잘라서 배열에 담기
					4. Employee객체를 만들어서 사원정보의 각 데이터를 Employee객체에 저장하기
					5. Employee객체를 employees 배열에 저장하기
			6. Employee 배열에 저장된 정보 출력하기
		*/
		int position = 0;
		Employee[] employees = new Employee[4];
		String text = "홍길동,영업팀,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,200";

		String[] arr1 = text.split("\\^");

		for(int i=0; i<arr1.length; i++) {
			String[] arr2 = arr1[i].split(",");
			//Employee temp = new Employee();
			employees[i] = new Employee();	// 값을 담을 목적이면 for문 안에 생성 //객체를 생성해줘야댐// 객체를 밖에 생성할 경우 마지막꺼만 4번 출력됨
			employees[i].setName(arr2[0]);
			employees[i].setDept(arr2[1]);
			employees[i].setPosition(arr2[2]);
			int salary = Integer.parseInt(arr2[3]);
			employees[i].setSalary(salary);

			//employees[i]=temp;
		}
		for(Employee s : employees) {
			s.info();
			//System.out.println("이름: "+s.getName());
			//System.out.println("부서: "+s.getDept());
			//System.out.println("직위: "+s.getPosition());
			//System.out.println("급여: "+s.getSalary());
			//System.out.println();
		}
		
		
	}
}