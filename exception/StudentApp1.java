import java.io.*;
import java.text.DecimalFormat;

public class StudentApp1 {
	
	public static Student1 parseData(String text) {
		Student1 st = new Student1();
		String[] arr = text.split(",");

		st.setName(arr[0]);
		st.setGrade(arr[1]);
		st.setKor(Integer.parseInt(arr[2]));
		st.setEng(Integer.parseInt(arr[3]));
		st.setMath(Integer.parseInt(arr[4]));

		return st;
	}



	public static void main(String[] args) throws Exception {
		Student1[] students = new Student1[10];

		BufferedReader reader = new BufferedReader(new FileReader("Student1.txt"));
		for (int i =0 ; i <students.length; i++){		
			students[i] = parseData(reader.readLine());
		}
		String pattern = "#.00";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("��  �� �� �� ���� ���� ���� ���� ���");
		System.out.println("---------------------------------------");


		for(Student1 s : students) {
			System.out.printf("%s %s  %d   %d   %d  %d  %s\n", s.getName(), s.getGrade(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), df.format(s.getAvg()));
		}	// DecimalFormat�� ��ü df�� format(df.format())�� s.getAvg()�� �����Ѵ�.

	
	}
}