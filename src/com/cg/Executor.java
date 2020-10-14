package com.cg;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome to Binary Tree Problem!!!");
		
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(50);
		binaryTree.add(36);
		binaryTree.add(70);
		
		int size = binaryTree.getSize();
		System.out.println(size);
	}
}
