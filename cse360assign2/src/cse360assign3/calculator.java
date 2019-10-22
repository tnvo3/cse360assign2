package cse360assign3;
//Name: Tran Vo
//Date: 10/19/2019
//Class ID: 85141
//Assignment 3

import java.lang.Math;
class Calculator extends AddingMachine{
	
	//constructor that call the constructor from parent class
	public Calculator(){
		super();
	}
	
	//This method multiply the current total to a value 
	public void mult(int value){
		total = total * value;
		history = history + " * " + value;
	}
	
	//This method divide the current total by a value
	//if the value equals 0
	//set the total to 0
	public void div(int value){
		if(value == 0)
		{
			total = 0;
			history = history + " / " + value;
		}
		else{
			total = total / value;
			history = history + " / " + value;
					
		}
	}
	//This method take a current total to a power of "value"
	//if the power equals a negative value then 
	//set the total to 0
	public void power(int value){
		if(value < 0)
		{
			total = 0;
			history = history + " ^ " + value;
		}
		else
		{
			
			total =(int)Math.pow(total,value);
			history = history + " ^ " + value;
		}
	}
	
		
	
}
