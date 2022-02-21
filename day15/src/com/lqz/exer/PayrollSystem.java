package com.lqz.exer;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
//		System.out.println("give birth month:");
//		Scanner s = new Scanner(System.in);
//		int monthIn = s.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		int monthIn = calendar.get(Calendar.MONTH);
		
		
		Employee[] emp = new Employee[2];
		emp[0] = new SalariedEmployee("Lily", 1001, new MyDate(1986, 6, 4), 20000.0);
		emp[1] = new HourlyEmlployee("Tom", 1002, new MyDate(1996, 11, 7), 56, 300);
		
		for (int i=0; i<emp.length; i++) {
			double monthSalary = emp[i].earnings();
			if(monthIn == emp[i].getBirthday().getMonth()) {
				monthSalary+=100;
			}
			System.out.println(emp[i]);
			System.out.println("Month Salary: "+ monthSalary);
			}
	}
}
