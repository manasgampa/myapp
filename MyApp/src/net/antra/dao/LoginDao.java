package net.antra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.antra.VO.UserCredentialsVO;
import net.antra.dto.UserCredentialsDTO;

public class LoginDao {

	public UserCredentialsVO userCredential(UserCredentialsDTO uDto) {
		Connection con=null;
		PreparedStatement  pstmt=null;
		String uname=uDto.getuName();
		UserCredentialsVO ucvo=new UserCredentialsVO();
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
			pstmt=con.prepareStatement("Select * from usertable where uname=?");
			pstmt.setString(1,uname);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				ucvo.setUname(rs.getString(1));
				ucvo.setPassword(rs.getString(2));
			}
			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ucvo;
	}
}
