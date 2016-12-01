public class Contact {
	
	private String name;
	private Tel[] tels = new Tel[50];
	private Address address; //포함관계
	private int position = 0;

	public Contact() {}
	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Tel[] getTels() {
		return tels;
	}
	public void addTel(Tel tel) {
		// tels배열의 적절한 위체에 담기
		tels[position] = tel;
		position++;
	}
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void info () {
		System.out.println("이    름 :  "+name);
		for(int i=0; i<position;i++) {
			System.out.println(tels[i].getType()+"->  "+tels[i].getNumber());
		}
		System.out.print("주    소 :  "+address.getSido()+" ");
		System.out.print(address.getGugun()+" ");
		System.out.println(address.getDetail());
		
	}
}