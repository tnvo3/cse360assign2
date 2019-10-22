package cse360assign2;
//Name: Tran Vo
//Date: 10/07/2019
//Class ID: 85141
//Assignment 2

public class AddingMachine {
	//create variables
	private int total;
	private String history;
	
	//constructor
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	//The method that returns the 
	//total of the math calculation 
	public int getTotal () {
		return total;
	}
	
	//Add method
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	//Subtract method
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	//toString that returns the whole math calculation 
	//from the beginning
	public String toString () {
		return history;
	}
	
	//clear method to reset 
	public void clear() {
		total = 0;
		history = "0";
	}
}






