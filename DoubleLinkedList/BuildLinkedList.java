package com.DoubleLinkedList;

public class BuildLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList d = new DoubleLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(60);
		d.add(70);
		//d.add(2, 15);
		d.remove(0);
		
		for (int i = 0; i <d.size(); i++) {
			System.out.println(d.get(i));
		}

	}

}
