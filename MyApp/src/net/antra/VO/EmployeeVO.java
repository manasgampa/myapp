package net.antra.VO;

public class EmployeeVO {

	public String empId;
	public String name;
	public int sal;
	
	
	public EmployeeVO(String empId, String name, int sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
