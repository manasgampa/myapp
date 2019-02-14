package net.antra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.antra.VO.UserCredentialsVO;
import net.antra.dto.CreateAccountDTO;

public class CreateAccountDao {

	
	public boolean createAccount(CreateAccountDTO caDTO) {
		
		Connection con=null;
		PreparedStatement  pstmt=null;
		String uname=caDTO.getuName();
		String password=caDTO.getPassword();
		boolean flag=false;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
			pstmt=con.prepareStatement("insert into usertable values(?,?)");
			pstmt.setString(1,uname);
			pstmt.setString(2, password);
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
