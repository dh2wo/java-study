package net.kdigital.generic;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Plastic> printer = new GenericPrinter<>();
		printer.getMaterial(new Plastic());

		Plastic p2 = printer.getMaterial();

		p2.doPrinting();
		System.out.println(p2.toString());	
	}
}