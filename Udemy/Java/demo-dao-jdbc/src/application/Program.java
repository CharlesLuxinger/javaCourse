package application;

import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//Find By ID Test
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println();
		//Find By Department Test
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		//Find All Test
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		/*
		 * System.out.println(); //Insert Test Seller newSeller = new Seller(null,
		 * "Greg Fews", "greg@email.com", new Date(), 4000.0, department);
		 * sellerDao.insert(newSeller); System.out.println("Inserted! New ID: " +
		 * newSeller.getId());
		 */
		
		System.out.println();
		//Update Test
		seller = sellerDao.findById(1);
		seller.setName("Maria Joana");
		seller.setEmail("maria@gmail.com");
		sellerDao.update(seller);
		seller = sellerDao.findById(1);
		System.out.println("Updated: " + seller);
		
		System.out.println();
		//Delete Test
		sellerDao.deleteById(8);
		System.out.println("Deleted row!!!");
		
	}
}
