package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {
		return super.price + customsFee;
	}
	@Override
	public final String priceTag() {
		return super.getName() + ", $" + String.format("%.2f", this.totalPrice()) + 
				"(Customs fee: $" + String.format("%.2f", this.customsFee) + ")";
	}
}
