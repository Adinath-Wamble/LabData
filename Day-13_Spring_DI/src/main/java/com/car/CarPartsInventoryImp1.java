package com.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CarPartsInventoryImp1")
public class CarPartsInventoryImp1 implements CarPartsInventory {
	@Autowired
	private DataSource dataSource;

	public void addNewCarPart(CarPart carParts) {
		Connection conn = null;
		try {
			long ms1 = System.currentTimeMillis();
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adinath", "root", "cdac");*/
			conn = dataSource.getConnection();
			long ms2 = System.currentTimeMillis();
			System.out.println("Approx time taken to obtain a connection from the pool : " + (ms2 - ms1) + " ms");
			PreparedStatement st = conn.prepareStatement("insert into tbl_carpart(part_name , car_model, price , quantity) values (? ,  ? ,  ? ,  ?)");
			st.setString(1, carParts.getPartName());
			st.setString(2, carParts.getCarModel());
			st.setDouble(3, carParts.getPrice());
			st.setInt(4,carParts.getQuantity());
			st.executeUpdate();
		}
		catch( SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
		

	}

	public List<CarPart> getAvalibleParts() {
		// TODO Auto-generated method stub
		return null;
	}

}
