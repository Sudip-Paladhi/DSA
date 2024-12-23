package com.practice;

public class ArrayList {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.Add(10);
		a1.Add(20);
		a1.Add(30);
		a1.Add(40);
		a1.Add(50);
		a1.remove(4);
		a1.Add(0, 35);
		
		for (int i = 0; i < a1.Size(); i++) {
			int n= (Integer) a1.get(i);
			System.out.println(n);
		}
		

	}
	
	Object [] a= new Object[5];
	int p=0;
	
	public void increaseArraySize() {
		Object [] temp= new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	public int Size(){ 
		return p;
		}	
	
	public void Add(Object ele){
		if(p>= a.length) increaseArraySize();
		a[p++]= ele;
	}
	
	public void Add(int index, Object ele) {
		if(p>= a.length) increaseArraySize();
		if (index <0 && index>=Size()) throw new IndexOutOfBoundsException();
		for (int i = Size()-1; i>=index; i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		p++;
	}
	
	public void remove(int index) {
		if (index <0 && index>=Size()) throw new IndexOutOfBoundsException();
		for (int i = index+1; i < Size(); i++) {
			a[i-1]= a[i];
		}
		--p;
		a[p]=null;
	}
	
	private Object get(int index) {
		return a[index];

	}

}
