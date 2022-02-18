package com.lqz.inheritance.java;

public class Kid {
	/*不同包下的普通类（非子类）要使用Person(Parents)类,
	不可以调用声明为private、缺省、protected权限的属性、方法
	*/
	// 1. 用static method: 必须new出Person Object.
	public static void method1() {
		Person person = new Person();
		person.defaultName = "defaultNameInKid";
		person.protectedName = "protectedNameInKid";
		person.publicName = "publicNameInKid";
		person.defaultAge();
		person.protectedAge();
		person.publicAge();
	}
	// 2. 用"传参数"method: 可直接调用属性、方法
	public void method2(Person person) {
		person.defaultName = "defaultNameInKid";
		person.protectedName = "protectedNameInKid";
		person.publicName = "publicNameInKid";
		person.defaultAge();
		person.protectedAge();
		person.publicAge();
	}
}
