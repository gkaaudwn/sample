public class SmartPhone extends Phone{

	private String ip;

	public SmartPhone() {
		//super();		// �θ��� �Ű����� ���� ������	// �θ�ü�� public Phone() {} �⺻�����ڰ� �־�� ���డ��
		System.out.println("SmartPhone() is running");
		//super()	// super()�� Ŭ���� �� ���� �ۼ�
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