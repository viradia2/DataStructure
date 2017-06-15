package com.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	//First node is called as root node.
	private Node root;
	
	 void printLevelOrder(){
		int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i); 
	 }
	 
	 
	 int height(Node root){
		if (root == null)
			return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.leftchild);
            int rheight = height(root.rightchild);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else 
            	return(rheight+1); 
        }	 
	 }
	 
	 void printGivenLevel (Node root ,int level){
		if (root == null)
			return;
        if (level == 1){
            System.out.print(root.data + " ");
        }
        else if (level > 1)
        {
        	System.out.println();
            printGivenLevel(root.leftchild, level-1);
            printGivenLevel(root.rightchild, level-1);
            
        } 
	 }
	 
	//For inserting a node to the tree
	public void insterNodeIntoTree(int item){

		if(root == null){
			root = new Node();
			root.data = item;
		}else{
			AddItemToSubTree(root, item);
		}
	}
	private void AddItemToSubTree(Node root2, int item) {
		// TODO Auto-generated method stub
		if(root2.data > item){
			AddItemToLeftTree(root2, item);
		}else{
			AddItemToRightTree(root2, item);
		}
	}

	private void AddItemToRightTree(Node root2, int item) {
		// TODO Auto-generated method stub
		
		if(root2.rightchild == null){
			root2.rightchild = new Node();
			root2.rightchild.data = item;
		}else{
			AddItemToSubTree(root2.rightchild, item);
		}
	}

	private void AddItemToLeftTree(Node root2, int item) {
		// TODO Auto-generated method stub
		
		if(root2.leftchild == null){
			root2.leftchild = new Node();
			root2.leftchild.data = item;
		}else{
			AddItemToSubTree(root2.leftchild, item);
		}
	}
	
	public Node findOne(int key){
		Node c = root;
		while(c != null){
			if(key == c.data){
				break;
			}
			if(key < c.data){
				c = c.leftchild;
			}else{
				c = c.rightchild;
			}
		}
		return c;
	}
	
	public void printAll(Node n){
		Node p = n;
		if(p != null){
			System.out.println(" " + p.data);
			printAll(p.leftchild);
			printAll(p.rightchild);
		}
	}
	public class Node{
		Node leftchild;
		int data;
		Node rightchild;
	}
}
