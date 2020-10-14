package com.cg;

public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	
	public BinaryNode<K> addRecursively(BinaryNode<K> current, K key){
		if(current == null) {
			return new BinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)	return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}
		if(compareResult > 0) {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	
	private int getSizeRecursive(BinaryNode<K> current) {
		return (current == null) ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}
	
	public void searchNode(K key) {
		root = searchNodeRecursive(root, key);
		if(root == null) {
			System.out.println("ELement Not Found!");
		}
		else {
			System.out.println("Element Found!");
		}
	}
	
	public BinaryNode<K> searchNodeRecursive(BinaryNode<K> root, K val) {
		if(root.key == val || root.key == null) {
			return root;
		}
		if((int)val < (int)root.key) {
			return searchNodeRecursive(root.left, val);
		}
		return searchNodeRecursive(root.right, val);
	}
}
