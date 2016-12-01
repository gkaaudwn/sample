import java.io.*;

public class ExceptionDemo4 {

	public static void writing() {		// 실행예외는 throws를 적지 않아도 됨
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12월 3일 볼빨간 사춘기 콘서트";

			writer.write(text);
			writer.flush();
		} catch (FileNotFoundException e) {
			throw new L2Exception();

		} catch (IOException e) {
			throw new L2Exception();
		}
	}

	public static void reading() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			String text = reader.readLine();
			System.out.println("내용: "+ text);

		} catch (FileNotFoundException e) {
			// FileNotFoundException이 발생한 것을 가로채고, 대신 htaException을 생성해서 던지기
			throw new L2Exception();
		} catch (IOException e) {
			throw new L2Exception();
		}

		
	}

	public static void main(String[] args) {
			ExceptionDemo4.reading();
			ExceptionDemo4.writing();
	}


	
}