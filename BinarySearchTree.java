package com.hashtable;

public class BinarySearchTreeUC3 {

	class Node {
		int key;
		Node left;
		Node right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	static Node root;
	static int key;
	private Object tree;

	public BinarySearchTreeUC3() {
		root = null;
	}  

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root,int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insertRec(root.left,key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		return root;

	}

	void inorder() {
		inorderRec(root);
	}
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.print( root.key + " ");
			inorderRec(root.right);
		}
	}

	boolean search(int key)  { 
		root = search(root, key); 
		if (root!= null)
			return true;
		else
			return false;
	} 

	Node search(Node root, int key)  { 
		 
		if (root==null || root.key==key) 
			return root; 
		// val is greater than root's key 
		if (root.key > key) 
			return search(root.left, key); 
		// val is less than root's key 
		return search(root.right, key); 
	} 

	public static void main(String[] args){
		BinarySearchTreeUC3  tree=new BinarySearchTreeUC3();

		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);

		System.out.println("Display the tree Inorder");
		tree.inorder();
		System.out.println();
		boolean search = tree.search (63);
		System.out.println("This key is present BST Tree: " + search );


	}
}
