import java.util.*;
public class SystemDemo {
	public static void main(String[] args) {
		
		// 현재 시간 알아내기(중요)
		long time1 = System.currentTimeMillis();

		System.out.println(time1);

		long time2 = System.currentTimeMillis();

		System.out.println(time2-time1);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// 환경변수값 조회하기
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// 현재 시스템의 줄바꿈문자 조회하기
		String newLineChar = System.getProperty("line.separator");
		System.out.println("asdfsa"+newLineChar+"sadfsaf");

		// 현재 시스템의 사용자 홈 디렐토리 조회하기
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// 프로그램 종료하기
		//System. exit(0);

		// 배열 복사하기
		String[] src = {"이순신", "강감찬", "김유신", "홍길동", "일지매", "임꺽정"};
		String[] dest = new String[10];

		System.arraycopy(src, 3, dest, 1, 2);	
		// (원본배열, 원본에서 복사할 항목의 시작위치, 새 배열, 새 배열에서 붙여넣을 시작위치 ,복사되는 갯수)

		System.out.println(Arrays.toString(dest));

	}
}