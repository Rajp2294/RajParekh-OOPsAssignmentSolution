package main;

import departments.AdminDepartment;
import departments.HrDepartment;
import departments.TechDepartment;

//Driver class Main is created
public class Driver {
	public static void main(String[] args) {
		AdminDepartment obj1 = new AdminDepartment();
		HrDepartment obj2 = new HrDepartment();
		TechDepartment obj3 = new TechDepartment();
		
		// Output by calling the methods created under Class AdminDepartment
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		
		// Output by calling the methods created under Class HrDepartment
		System.out.println();
		System.out.println(obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
			
		// Output by calling the methods created under Class TechDepartment
		System.out.println();
		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
		
	}
}
