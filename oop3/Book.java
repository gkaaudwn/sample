public class Book {
	// ����ȭ�� �Ӽ� �����ϱ�
	// å��ȣ(no), ����(title), ����(author), ���ǻ�(publisher), ����(price), ������(pubdate 2001-01-23)
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pubdate;

	// ������ ��� �����ϱ�
		// �⺻������ �����ϱ�
	public Book () {}

		// ��� �Ӽ��� �ʱ�ȭ�ϱ� ���� �Ű����� �ִ� ������ �����ϱ�
	public Book (int no, String title, String author, String publisher, int price, String pubdate) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pubdate = pubdate;
	}

		// ��� �Ӽ��� ���� ������ getter�Լ� �����ϱ�
	public int getNo () {
		return no;
	}

	public void setNo (int no) {
		this.no = no;
	}

	public String getTitle () {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor () {
		return author;
	}
	public void setAuthor(String autor) {
		this.author = author;
	}

	public String getPublisher () {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice () {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	public String getPubdate () {
		//this.pubdate = "2001-01-23";
		return this.pubdate;
	}

	public void setPubdate (String pubdate) {
		this.pubdate = pubdate;
	}
	
	public void info() {
		System.out.printf("%d %s %s %s %d %s\n", no, author, publisher, price, pubdate);
	}

	

}