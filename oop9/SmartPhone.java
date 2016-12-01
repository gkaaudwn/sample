public class SmartPhone extends Phone{

	private String ip;

	public SmartPhone() {
		//super();		// 부모의 매개변수 없는 생성자	// 부모객체에 public Phone() {} 기본생성자가 있어야 실행가능
		System.out.println("SmartPhone() is running");
		//super()	// super()는 클래스 맨 위에 작성
	}

	public SmartPhone(String tel, String company, String ip) {
		super(tel,company);
		this.ip = ip;

		System.out.println("SmartPhone(String, String, String) is running");
	}

	public String getIp() {
		return ip;
	}

	public void setIP(String ip) {
		this.ip = ip;
	}
}