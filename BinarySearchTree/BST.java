package com.BinarySearchTree;

public class BST {

	static class Node {
		int ele;
		Node left;
		Node right;

		Node(int ele) {
			this.ele = ele;
		}
	}

	public static Node Insert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}

		if (root.ele > value) {
			root.left = Insert(root.left, value);
		} else {
			root.right = Insert(root.right, value);
		}
		return root;

	}

	public static boolean Search(Node root, int key) {

		if (root == null) {
			return false;
		}

		if (root.ele > key) {
			return Search(root.left, key);
		} else if (root.ele == key) {
			return true;
		} else {
			return Search(root.right, key);
		}
	}

	public static Node Delete(Node root, int value) {
		if (root.ele > value) {
			root.left = Delete(root.left, value);
		} else if (root.ele < value) {
			root.right = Delete(root.right, value);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			}

			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			Node IS = InorderSucessor(root.right);
			root.ele = IS.ele;
			root.right = Delete(root.right, value);

		}
		return root;

	}

	public static Node InorderSucessor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	public static void InOrder(Node root) {
		if (root == null) {
			return;
		}
		InOrder(root.left);
		System.out.println(root.ele + "");
		InOrder(root.right);
	}

	public static void main(String[] args) {
		int[] values= {2,8,5,4,6,9,7,3,1};
		Node root=null;
		for (int i = 0; i < values.length; i++) {
			root =Insert(root, values[i]);
		}
		
		InOrder(root);
		System.out.println();
		Delete(root, 4);
		InOrder(root);
		

	}

}
