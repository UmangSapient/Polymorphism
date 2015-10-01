package com.training.domains;
import com.training.ifaces.Automobile;;

public class ShowRoom {
	
	public Automobile getProduct(int key)
	{
		Automobile auto= null;
		
switch (key) 
		{
		
		     case 1:
			return new Maruti();
		

		    case 2:
			return new Toyota();
					
		    default:
		    return null;
		}
		
	
	}

	public void printQuote(Automobile auto)
	{
		System.out.println(auto.getMode1());
		System.out.println(auto.getColor());
		System.out.println(auto.getPrice());
	}
}
