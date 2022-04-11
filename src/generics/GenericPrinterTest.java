package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Point<Integer, Double> point1 = new Point<>(0, 0.0);
		
		System.out.println(point1.getX());
		System.out.println(point1.getY());
		
//		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
//		Powder powder = new Powder();
//		powderPrinter.setMaterial(powder);
//		Powder p = powderPrinter.getMaterial();
//		powder.doPrinting();
//		
//		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
//		Plastic plastic = new Plastic();
//		plasticPrinter.setMaterial(plastic);
//		Plastic pla = plasticPrinter.getMaterial();
//		plastic.doPrinting();
		
	}

}
