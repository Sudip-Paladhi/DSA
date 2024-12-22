package com.DoubleLinkedList;

public class DoubleLinkedList {
        	 private Node first=null;
        	 private int count=0;
        	 
        	 public int size() {
        		 return count;
        	 }
        	 
        	 public void add(Object e) {
        		 if(first ==null) {
        			 first= new Node(e);
        			 count++;
        			 return;
        		 }
        		 
        		 Node curr= first;
        		 while(curr.next!=null) {
        			 curr=curr.next;
        		 }
        		 curr.next=new Node(e, curr, null);
        		 count++; 
        	 }
        	 
        	 public void add(int index, Object e) {
        		 if(index<0 || index>size()) throw new IndexOutOfBoundsException();
        		 if(index==0) {
        			 first= new Node(e, null, first);
        			 count++;
        			 return;
        		 }
        		 
        		 Node curr= first;
        		 for(int i=1; i<index; i++) {
        			 curr=curr.next;
        		 }
        		 curr.next = new Node(e, curr, curr.next);
//        		 curr.next.prev=n;
//        		 curr.next=n;
        		 count++;
        	 }
        	 
        	 public void remove(int index) {
        		 if(index <0 || index>size()) throw new IndexOutOfBoundsException();
				if(index == 0) {
					first=first.next;
					count--;
				}
				
				Node curr= first;
				for (int i = 1; i < index; i++) {
					curr=curr.next;
				}
				curr.next=curr.next.next;
				count--;
			}
        	 
        	 
        	 
        	 public Object get(int index) {
				if(index <0 || index>size()) throw new IndexOutOfBoundsException();
				Node curr = first;
				for (int i = 1; i <= index; i++) {
					curr= curr.next;
				}
				return curr.ele;
			}
         }
