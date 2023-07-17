package application;

import java.sql.SQLException;

import model.entities.Department;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
	}

}
