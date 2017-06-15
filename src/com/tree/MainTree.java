package com.tree;

public class MainTree {
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		bt.insterNodeIntoTree(30);
		bt.insterNodeIntoTree(20);
		bt.insterNodeIntoTree(34);
		bt.insterNodeIntoTree(15);
		bt.insterNodeIntoTree(28);
		bt.insterNodeIntoTree(38);
		bt.insterNodeIntoTree(70);
		bt.insterNodeIntoTree(80);
		bt.insterNodeIntoTree(91);
		bt.insterNodeIntoTree(100);
		bt.insterNodeIntoTree(110);
		bt.printAll(bt.findOne(34));
	}
}
