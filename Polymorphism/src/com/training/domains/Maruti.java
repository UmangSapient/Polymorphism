package com.training.domains;

import com.training.ifaces.Automobile;

public class Maruti implements Automobile {

	@Override
	public String getMode1() {
		// TODO Auto-generated method stub
		return "Wagon R";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 5000000.00;
	}

}
