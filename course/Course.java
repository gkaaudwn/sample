package course;

import java.util.ArrayList;

public class Course {
	
	private int code;
	private String name;
	private Professor prof;	// 교수정보
	private int limit;
	private ArrayList<Student> students = new ArrayList<>();
	
	public Course(){}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Professor getProf() {
		return prof;
	}

	public void setProf(Professor prof) {
		this.prof = prof;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + ", prof=" + prof + ", limit=" + limit + ", students="
				+ students + "]";
	}
	
	
	
	
}
