package de.telekom.sea7;

public class BaseObject {
	private int id;
	private Object parent;
	private static int count;
	
	public BaseObject(Object parent) {
		this.id = count++;
		this.parent = parent;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Object getParent() {
		return parent;
	}
	
	public void setParent(Object parent) {
		this.parent = parent;
	}
}
