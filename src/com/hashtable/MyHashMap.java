package com.hashtable;

public class MyHashMap {

	public String[] array = new String[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap m = new MyHashMap();
		
		m.putValueToHashMap(101, "Viradia2");
		m.printArray();
		m.putValueToHashMap(102, "Viradia");
		m.printArray();
		m.putValueToHashMap(101, "Viradia3");
		m.printArray();
		m.removeValueFromHashMap(101);
		m.printArray();
		m.putValueToHashMap(101, "Viradia2");
		m.printArray();
		
	}

	private void getValueFromHashMap(int key) {
		// TODO Auto-generated method stub
//		int o_key = conertToIndexZeroToNine(key);
		
		if(key >= array.length)
			System.out.println("No such key");
		
		if(array[key] == null)
			System.out.println("Value is Null");
		else
			System.out.println("Value is: " + array[key]);
}

	private void removeValueFromHashMap(int key) {
		// TODO Auto-generated method stub
		int o_key = conertToIndexZeroToNine(key);
		
		if(array[o_key] == null)
			System.out.println("Nothing To Remove");
		else
			array[o_key] = null;
	}

	private void printArray() {
		// TODO Auto-generated method stub
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}

	private void putValueToHashMap(int key, String value) {
		// TODO Auto-generated method stub
		int o_key = conertToIndexZeroToNine(key);
		
		if(array[o_key] == null)
			array[o_key] = value;
		else
			System.out.println("Confilct Values.");
}

	private int conertToIndexZeroToNine(int key) {
		// TODO Auto-generated method stub
		return key % 10;
	}

}
