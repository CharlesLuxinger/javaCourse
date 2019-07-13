package application;

import devices.ComboDevice;
import devices.ConcretedPrinter;
import devices.ConcretedScanner;

public class Program {

	public static void main(String[] args) {
		ConcretedPrinter p = new ConcretedPrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		ConcretedScanner s = new ConcretedScanner("2001");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("30001");
		c.processDoc("My music");
		c.print("My music");
		System.out.println("Combo result: " + c.scan());
		
	}

}
