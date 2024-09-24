package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Bill;

public class BillDAO {

	private static Connection conn;
	
	public BillDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	public static Bill getBillById(int Id) {
		Bill b = new Bill(Id, null, Id, null, null, Id, Id, Id, Id, Id, Id, null);
		try {
			
			String sql = "select * from bill where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				b=new Bill(Id, sql, Id, sql, sql, Id, Id, Id, Id, Id, Id, sql);
				b.setId(rs.getInt(1));
				b.setFullName(rs.getString(2));
				b.setDoctorcharges(rs.getInt(3));
				b.setMedicinenames(rs.getString(4));
				b.setDiseases(rs.getString(5));
				b.setMedicinequantity(rs.getInt(6));
				b.setMedicinecharges(rs.getInt(7));
				b.setBedcharges(rs.getInt(8));
				b.setNursecharges(rs.getInt(9));
				b.setExtracharges(rs.getInt(10));
				b.setAmountDue(rs.getDouble(11));
				b.setPymentStatus(rs.getString(12));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
}
