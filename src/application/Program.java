package application;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== OPERATION FIND BY ID ===");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== OPERATION FIND BY DEPARTMENT ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== OPERATION FIND ALL ===");
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== OPERATION INSERT ===");
		Seller newSeller = new Seller(null, "Natan", "natan@ntnconsultoria.com.br", new Date(), 1000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		System.out.println();
		
		System.out.println("=== OPERATION UPDATE ===");
		seller = sellerDao.findById(1);
		seller.setName("NATAN");
		sellerDao.update(seller);
		System.out.println("Updated Done!");
		System.out.println();
		
		System.out.println("=== OPERATION DELETE ===");
		sellerDao.deleteById(3);
		System.out.println("Deletion Done!");
		System.out.println();
		
		
	}

}
