package com.lqz.java1;

public class Printer implements USB {
	private final String NAME="Printer";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Printer usb start");
	}


	@Override
	public void stop() {
		System.out.println("Printer usb stop");
	}

	public String getNAME() {
		return NAME;
	}

}
