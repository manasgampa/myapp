package net.antra.business;

import net.antra.dao.CreateAccountDao;
import net.antra.dto.CreateAccountDTO;

public class CreateAccountModel {

	public boolean createAccount(String userName,String password){
		
		CreateAccountDTO caDTO=new CreateAccountDTO();
		caDTO.setuName(userName);
		caDTO.setPassword(password);
		CreateAccountDao caDao=new CreateAccountDao();
		boolean result=caDao.createAccount(caDTO);
		return result;
	}
	
}
