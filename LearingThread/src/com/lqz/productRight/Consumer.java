package com.lqz.productRight;

public class Consumer implements Runnable{
	Distributor distr = Distributor.getInstance();

	@Override
	public void run() {
		while(true) {
			distr.consume();
		}
	}

}
