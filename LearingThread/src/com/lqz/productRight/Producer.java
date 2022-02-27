package com.lqz.productRight;

public class Producer implements Runnable {
	Distributor distr = Distributor.getInstance();

	@Override
	public void run() {
		while(true) {
			distr.produce();
		}
	}

}
