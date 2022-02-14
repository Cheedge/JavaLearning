package com.lqz.java;

public class StudentTest {
	public static void main(String[] args) {
		Student[] stu = new Student[20];
		for (int i=0; i<stu.length; i++) {
			stu[i] = new Student();
			stu[i].num = i + 1;
			stu[i].grade = (int)(Math.random()*(6-1+1) + 1);
			stu[i].score = (int)(Math.random()*(100-0+1) + 0);
		}
		//loop over 
		for (int i=0; i<stu.length; i++) {
			System.out.println(stu[i].info());
		}
		System.out.println("****************");
		// print grade 3 students info
		for (int i=0; i<stu.length; i++) {
			if(stu[i].grade == 3) System.out.println(stu[i].info());
		}
		// bubble sort
		System.out.println("-----------------------------");
		for (int i=0; i<stu.length; i++) {
			for (int j=0; j<stu.length-i-1; j++) {
				if(stu[j].score>stu[j+1].score) {
					Student temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
			}
		}
		for (int i=0; i<stu.length; i++) {
			System.out.println(stu[i].info());
		}
	}
}
