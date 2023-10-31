package com.nongeneric;

public class GenericBox <T extends Displayble>
{
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
	public void show() {
		obj.display();
	}
}
