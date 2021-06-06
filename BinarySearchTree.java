package com.hashtable;

public class BinarySearchTreeUC1 {

	class Node {
		int key;
		Node left;
		Node right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	Node root;
	int key;

	public BinarySearchTreeUC1() {
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
	public static void main(String[] args){
		BinarySearchTreeUC1 tree =new BinarySearchTreeUC1();

		tree.insert(56);
		tree.insert(30);
		tree.insert(70);

		System.out.println("Display the Tree inorder");
		tree.inorder();
	}
}

