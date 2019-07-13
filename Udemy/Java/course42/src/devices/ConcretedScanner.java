package devices;

public class ConcretedScanner extends Device implements Scanner{
	public ConcretedScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	public String scan() {
		return "Scanned content";
	}
}
