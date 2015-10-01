package com.training.domains;

import com.training.ifaces.Automobile;

public class Toyota implements Automobile {

	@Override
	public String getMode1() {
		// TODO Auto-generated method stub
		return "Etios";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 70000000.000;
	}

}
