package net.antra.business;

import net.antra.VO.UserCredentialsVO;
import net.antra.dao.LoginDao;
import net.antra.dto.UserCredentialsDTO;

public class LoginModel {

	public UserCredentialsDTO ucDto;
	public LoginDao lDao;
	public boolean ValidateCredentials(String userName,String password) {
		ucDto=new UserCredentialsDTO(userName,password);
		lDao=new LoginDao();
		UserCredentialsVO uVO=lDao.userCredential(ucDto);
		if(ucDto.getPassword().equals(uVO.getPassword())) {
			return true;
		}else {
			return false;
		}
		
	}
}
