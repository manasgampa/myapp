package net.antra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.antra.dto.InsertRecordDTO;

public class InsertRecordDao {

	public boolean insertRecord(InsertRecordDTO irDTO) {
		
		Connection con=null;
		PreparedStatement  pstmt=null;
		String empId=irDTO.getEmpId();
		String empName=irDTO.getEmpName();
		int sal=irDTO.getSalary();
		boolean flag=false;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
			pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setString(1,empId);
			pstmt.setString(2, empName);
			pstmt.setInt(3, sal);
			int result=pstmt.executeUpdate();
			
			if(result==1) {
				flag=true;
				
			}else {
				flag=false;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return flag;
	}
}
