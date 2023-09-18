package com.grreatlearning.fop.g1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRDepartment hrDept=new HRDepartment();
		TechDepartment techDept=new TechDepartment();
		AdminDepartment adminDept=new AdminDepartment();
		
		System.out.println("Welcome to Admin Department");
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println("\n");
		System.out.println("Welcome to HR Department");
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		
		System.out.println("\n");
		System.out.println("Welcome to Tech Department");
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}
}
