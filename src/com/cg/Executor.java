package com.cg;

public class Executor {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Binary Tree Problem!!!");
		
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(50);
		binaryTree.add(36);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(36);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(32);
		binaryTree.add(16);
		binaryTree.add(63);

		int size = binaryTree.getSize();
		System.out.println(size);

		binaryTree.searchNode(63);
		
	}
}
