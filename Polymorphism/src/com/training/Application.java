package com.training;

import java.util.Scanner;

import com.training.domains.*;
import com.training.ifaces.*;


public class Application {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i=0;
		
		do{
			
		i++;
		System.out.println("Please enter the key:");
		int key=sc.nextInt();
		
		NewShowroom obj = new NewShowroom();
		
		
		Automobile auto =obj.getProduct(key);
		
		obj.printQuote(auto);
		}while(i<4);
	}

}
