public class SwitchDemo {
	public static void main (String[] args) {
		
		String grade = "Gold";
		switch (grade) {
			case "Gold":
				System.out.println("골드등급 고객님 환영합니다");
				break;
			case "Silver":
				System.out.println("실버등급 고객님 환영합니다");
				break;
			case "Bronze":
				System.out.println("브론즈등급 고객님 환영합니다");
				break;
			default:
				System.out.println("손님 환영합니다");
		}
	}
}