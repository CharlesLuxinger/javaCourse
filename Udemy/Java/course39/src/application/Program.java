package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Interface Intro

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (DD/MM/YYYY HH:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (DD/MM/YYYY HH:ss): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental carRentaled = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

		rentalService.processInvoice(carRentaled);

		System.out.println("INVOICE: ");
		System.out.println("Basic payment: " + String.format("%.2f", carRentaled.getInvoice().getBasicPayment()));
		System.out.println("Taxs: " + String.format("%.2f", carRentaled.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", carRentaled.getInvoice().getTotalPaymet()));

		sc.close();

	}

}
