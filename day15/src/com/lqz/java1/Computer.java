package com.lqz.java1;

public class Computer {
	public final double DATATOTAL=1024000;
	public void transmit(USB device) {
		device.start();
		double second = DATATOTAL/USB.DATAPERSECOND;
		System.out.println(second+" seconds finished transmission.");
		device.stop();
	}

}
