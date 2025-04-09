package Comparator_interface;

import java.util.Comparator;

public class Empolyee implements Comparator<Empolyee> {
	int emp_id;
	String emp_name;
	long emp_salary;
	
	
	public Empolyee(int emp_id, String emp_name, long emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(long emp_salary) {
		this.emp_salary = emp_salary;
	}
	@Override
	public String toString() {
		return "Empolyee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
	@Override
	public int compare(Empolyee o1, Empolyee o2) {
		// TODO Auto-generated method stub
		return o1.compare(o1, o2);
	}
	
	

}
