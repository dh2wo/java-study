package net.kdigital.generic;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();

		Powder p1 = new Powder();
		printer.setMaterial(p1);

		Powder p2 = (Powder)printer.setMaterial();
		p2.doPrinting();
		System.out.println(p2.toString());	

	}


}
