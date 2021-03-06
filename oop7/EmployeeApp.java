public class EmployeeApp {
	public static void main(String[] args) {
		
		// 5명의 사원정보를 관리하기
		Employee[] employees = new Employee[3];

		// 사원정보
		Employee emp1 = new Employee();
		emp1.no = 23;
		emp1.name = "홍길동";
		//emp1.print();

		// 영업사원 정보
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "이순신";
		emp2.goal = 50;
		emp2.result = 37;
		//emp2.print();

		// 개발부 사원 정보
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "김유신";
		emp3.todo = 10;
		emp3.completed = 4;
		//emp3.print();

		// 배열에 사원정보 저장
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;

		// 값 출력하기
		//employees[0].print();
		//employees[1].print();
		//employees[2].print();

		//for (int i=0; i<employees.length; i++) {
		//	employees[i].print();
		//}

		for (Employee emp: employees) {
			//emp.print();

			if (emp instanceof Sales) {			// emp가 바라보는게 Sales의 객체(instanceof)냐 결과는 true/false
				((Sales) emp).drawGraph();		// emp가 바라보는 Sales를 찾고 그안에 drawGraph()를 실행해라
			} else if (emp instanceof Developer) {
				((Developer) emp).develop();
			}
		}

	}
}