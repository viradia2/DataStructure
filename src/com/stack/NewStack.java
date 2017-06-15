package com.stack;

public class NewStack {
	private int[] array = new int[5];
	private int counter = 0;
	
	public static void main(String[] args) {
		
		NewStack ns = new NewStack();
		ns.push(5);
		ns.push(6);
		ns.printStack();
		int element = ns.pop();
		int element1 = ns.pop();
		int element2 = ns.pop();
		System.out.println("Pop Element: " + element);
		System.out.println("Pop Element1: " + element1);
		System.out.println("Pop Element2: " + element2);
	}
	
	public void push(int value){
		if(counter != array.length){
			array[counter] = value;
			counter++;
		}else{
			System.out.println("Stack Is Full.");
		}
	}
	
	public int popQueue(){
		int element = array[counter];
		array[counter] = 0;
		counter ++;
		return element;
	}
	
	public int pop(){
		int popelement = 0;
		if(counter == 0){
			System.out.println("Stack is Empty");
		}else{
			popelement = array[counter - 1];
			array[counter - 1] = 0;
			counter--;
		}
		return popelement;
	}
	
	public void printStack(){
		for(int j=0; j<array.length; j++){
			System.out.println("Stack: " + array[j] + " Position: " + j);
		}
	}
}
