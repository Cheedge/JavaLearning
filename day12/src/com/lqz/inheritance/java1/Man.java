package com.lqz.inheritance.java1;

import com.lqz.inheritance.java.Person;

public class Man extends Person {
	// 在不同包的子类中，不能调用Person(Parents)类中声明为private和缺省权限的属性、方法
	// static method中不能调用Person(Parents)类中任何属性、方法
	// 子类中,不用new Person, 可直接调用属性、方法
	public void method(String[] args) {
		protectedName = "protectedNameInMan";
		publicName = "publicNameInMan";
		protectedAge();
		publicAge();	
	}
	//同一个包中的其他类，不可以调用Order类中私有的属性、方法
//	order.orderPrivate = 4;
//	order.methodPrivate();
}
