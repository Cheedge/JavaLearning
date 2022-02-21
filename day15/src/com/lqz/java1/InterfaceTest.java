package com.lqz.java1;
/*
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
		Computer comput = new Computer();
		// 接口非匿名,实现 类非匿名对象
		Printer printer = new Printer();
		comput.transmit(printer);
		// 接口非匿名,实现 类匿名对象
		comput.transmit(new Printer());
		// 接口匿名,实现 类非匿名对象
		USB keyboard = new USB() {
			
			@Override
			public void start() {
				System.out.println("KeyBoard usb start");
			}
			@Override
			public void stop() {
				System.out.println("KeyBoard usb start");
			}	
		};
		comput.transmit(keyboard);
		// 接口匿名,实现 类匿名对象
		comput.transmit(new USB() {
			@Override
			public void start() {
				System.out.println("Monitor usb start");
			}
			@Override
			public void stop() {
				System.out.println("Monitor usb start");
			}
		});
		
	}
}
