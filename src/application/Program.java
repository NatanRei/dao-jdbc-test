package application;

import java.sql.SQLException;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== OPERATION FIND BY ID ===");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		System.out.println();
		
		
		
	}

}
