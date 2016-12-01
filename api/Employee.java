public class Employee {
	
	private String name;
	private String dept;
	private String position;
	private String salary;

	public Employee() {}

	public Employee(String name, String dept, String position, String salary) {
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

	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
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