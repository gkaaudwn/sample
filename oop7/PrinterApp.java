public class PrinterApp {
	public static void main(String[] args) {
		
		// 흑백인쇄
		Printer p1 = new Printer();
		p1.print("이번주 금요일 영타대회...");

		ColorPrinter p2 = new ColorPrinter();
		p2.print("월욜날 찍은 사진");
		
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("증명사진");
	}
}