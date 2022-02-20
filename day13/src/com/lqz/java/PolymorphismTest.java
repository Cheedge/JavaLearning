package com.lqz.java;
/*
 * 编译看左;运行看右。
 */
public class PolymorphismTest {
	public void method(Person e) {// 对Person类，子类编译时都可进来；
		//但运行时只有子类才可调用子类特有函数
		e.getInfo();
		e.say();
		if (e instanceof Student) {
			System.out.println(e.name+" is a Student");
			((Student) e).goSchool();
		}else {
			System.out.println(e.name+" is not a Student");
		}
		}
		public static void main(String args[]) {
		PolymorphismTest t = new PolymorphismTest();
//		Person e = new Student();
//		e.getInfo(); 调用Student类的getInfo()方法
		
//		Person m = new Person(123, "Lily");//
//		Student m = new Student(123, "Lily");//子类的对象m传送给父类类型的参数e
//		Person m = new Student(123, "Lily");//
//		t.method(m); // 
		
		//Casting
		Person p = new Person(456, "Tom");
//		Person p = new Student(456, "Tom");
		Student s = (Student) p;
//		if (p instanceof Student) {
//			System.out.println(p.name+" is a Student");
//			((Student) p).goSchool();
//		}else {
//			System.out.println(p.name+" is not a Student");
//		}
		}
}
