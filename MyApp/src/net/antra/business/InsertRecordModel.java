package net.antra.business;

import net.antra.dao.InsertRecordDao;
import net.antra.dto.InsertRecordDTO;

public class InsertRecordModel {

	public boolean insertRecord(String empId,String empName,String sal) {
		InsertRecordDTO irDTO=new InsertRecordDTO();
		irDTO.setEmpId(empId);
		irDTO.setEmpName(empName);
		int newsal=Integer.parseInt(sal);
		irDTO.setSalary(newsal);
		
		InsertRecordDao irDAO=new InsertRecordDao();
		boolean result=irDAO.insertRecord(irDTO);
		return result;
	}
}
