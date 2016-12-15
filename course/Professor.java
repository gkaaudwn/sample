package course;

public class Professor {
	
	private String proId;
	private String proPw;
	private int proNum;
	private String name;
	private String promajor;
	
	public Professor(){}

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPromajor() {
		return promajor;
	}

	public void setPromajor(String promajor) {
		this.promajor = promajor;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProPw() {
		return proPw;
	}

	public void setProPw(String proPw) {
		this.proPw = proPw;
	}

	@Override
	public String toString() {
		return "Professor [proId=" + proId + ", proPw=" + proPw + ", proNum=" + proNum + ", name=" + name
				+ ", promajor=" + promajor + "]";
	}

	
	
	
}
