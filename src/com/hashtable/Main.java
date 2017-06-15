package com.hashtable;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		Student std1 = new Student("Vivek", "901804", 3.5);
		Student std2 = new Student("Keval", "901805", 4);
		Student std3 = new Student("Dipak", "901806", 3.6);
		Student std4 = new Student("Suresh", "901814", 3.5);
		Student std5 = new Student("Pondi", "901841", 3.2);
		
		int key1 = ht.toHashCode(std1.getRoll_no());
		int key2 = ht.toHashCode(std2.getRoll_no());
		int key3 = ht.toHashCode(std3.getRoll_no());
		int key4 = ht.toHashCode(std4.getRoll_no());
		int key5 = ht.toHashCode(std5.getRoll_no());
		
		ht.insert(key1, std1);
		ht.insert(key2, std2);
		ht.insert(key3, std3);
		ht.insert(key4, std4);
		ht.insert(key5, std5);
		
		ht.deleteData(std5.getRoll_no());
		
		ht.showAllData();
		System.out.println();
		
		System.out.println("According your roll no the sudent data is .... :");
		Student dat = ht.getData(std4.getRoll_no());
		System.out.println(dat.toString());
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "Vivek");
		hm.put(3, "Naimish");
		hm.put(4, "Jay");
		
		
	}
}
