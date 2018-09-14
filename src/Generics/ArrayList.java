package Generics;

import java.util.Arrays;

public class ArrayList<E> {
	
	private Object[] list;
	private int next;
	
	public ArrayList(int capacity) {
		list  = new Object[capacity];
	}
	public ArrayList() {
		this(16);
	}
	public void add(E e) {
		if(next == list.length) {
			list = Arrays.copyOf(list,list.length*2);
		}
		list[next++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E)list[index];
	}
	public int size() {
		return next;
	}
}
