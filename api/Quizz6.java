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
			System.out.println("#### ���� ���� ####");
			System.out.println("�̸�: "+name);
			System.out.println("�μ�: "+dept);
			System.out.println("����: "+position);
			System.out.println("�޿�: "+salary+"����");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		/*
			1. �̸�, �μ�, ����, �޿������� �� �ִ� Employee Ŭ���� �����ϱ�
				(�ʵ� ����, �⺻������, getter/setter)
			
			2. ^�� �������� ���ڿ� �߶� �迭�� ���
				3. �迭�� ��������� �ϳ��� �����ؼ� , �� �߶� �迭�� ���
					4. Employee��ü�� ���� ��������� �� �����͸� Employee��ü�� �����ϱ�
					5. Employee��ü�� employees �迭�� �����ϱ�
			6. Employee �迭�� ����� ���� ����ϱ�
		*/
		int position = 0;
		Employee[] employees = new Employee[4];
		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,200";

		String[] arr1 = text.split("\\^");

		for(int i=0; i<arr1.length; i++) {
			String[] arr2 = arr1[i].split(",");
			//Employee temp = new Employee();
			employees[i] = new Employee();	// ���� ���� �����̸� for�� �ȿ� ���� //��ü�� ��������ߴ�// ��ü�� �ۿ� ������ ��� ���������� 4�� ��µ�
			employees[i].setName(arr2[0]);
			employees[i].setDept(arr2[1]);
			employees[i].setPosition(arr2[2]);
			int salary = Integer.parseInt(arr2[3]);
			employees[i].setSalary(salary);

			//employees[i]=temp;
		}
		for(Employee s : employees) {
			s.info();
			//System.out.println("�̸�: "+s.getName());
			//System.out.println("�μ�: "+s.getDept());
			//System.out.println("����: "+s.getPosition());
			//System.out.println("�޿�: "+s.getSalary());
			//System.out.println();
		}
		
		
	}
}