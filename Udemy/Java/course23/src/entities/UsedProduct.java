package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		return super.getName() + " (used), $" + String.format("%.2f", super.getPrice()) + 
				" (Manufacture date: $" + sdf.format(this.manufactureDate) + ")";
	}

}
