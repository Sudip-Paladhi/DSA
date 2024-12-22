package com.LinkedList;

public class BuildLinkedList {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(60);
		l.add(1, 50);
		
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}

	}

}