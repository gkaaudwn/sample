package course;

import java.util.ArrayList;

public class Student {
	
	private String stuId;
	private String stuPw;
	private int stuNum;
	private String name;
	private String stuMajor;
	private int grade;
	private ArrayList<Course> course = new ArrayList<>();
	
	public Student(){}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuMajor() {
		return stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuPw() {
		return stuPw;
	}

	public void setStuPw(String stuPw) {
		this.stuPw = stuPw;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuPw=" + stuPw + ", stuNum=" + stuNum + ", name=" + name + ", stuMajor="
				+ stuMajor + ", grade=" + grade + ", course=" + course + "]";
	}

	
	
	
	
}
