package com.LinkedList;

public class LinkedList {

		private Node first= null;
		private int count= 0;
		
		
		//Add method
		public void add(Object e) {
			if(first==null) {
				first= new Node(e);
				count++;
				return;
			}
			
			Node curr= first;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next= new Node(e);
			count++;
		}
		
		
		// Index Add method
		public void add(int index, Object e) {
			if(index<0 || index>size()) throw new IndexOutOfBoundsException();
			if(index==0) {
				first= new Node(e,first);
				count++;
				return;
			}
			
			Node curr= first;
			for(int i=1; i<index; i++) {
			curr= curr.next;
			}
			curr.next= new Node(e, curr.next);
			count++;
		}
		
		
		//Get method
		public Object get (int index) {
			if(index<0 || index>size()) throw new IndexOutOfBoundsException();
			
			Node curr= first;
			for (int i = 1; i <=index; i++) {
				curr=curr.next;
			}
			return curr.ele;
		}
		
		
		//Get Size
		public int size() {
			return count;
		}
		
		
		//Reverse LinkedList
		public void reverse() {
			Node prev=null, curr=first, next=null;
			while(curr!=null) {
				next=curr.next;
				curr.next= prev;
				prev=curr;
				curr=next;
			}
			first=prev;
		}
		
		
		//Remove LinkedList
		public void remove(int index) {
			if(index<0 || index>size()) throw new IndexOutOfBoundsException();
			
			if(index==0) {
				first=first.next;
				count--;
				return;
			}
			
			Node curr= first;
			for (int i = 1; i < index; i++) {
				curr= curr.next;
			}
			curr.next= curr.next.next;
			count--;
		}	

	}
