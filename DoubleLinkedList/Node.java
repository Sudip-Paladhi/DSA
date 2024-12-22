package com.DoubleLinkedList;

      public class Node {

    	  Object ele;
    	  Node prev, next;
    	  
    	  Node(Object e) {
		  this(e,null,null);
		}
    	  
    	  public Node(Object e, Node p, Node n) {
			ele=e;
			prev=p;
			next=n;
		}
    	  
      }
