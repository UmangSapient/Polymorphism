package com.training.domains;

import com.training.ifaces.Automobile;

public class NewShowroom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		if(key==3)
			
		{
			return new BajajBike();
		}
		
		else
		{
		return super.getProduct(key);
		}
	}
	
	

}
