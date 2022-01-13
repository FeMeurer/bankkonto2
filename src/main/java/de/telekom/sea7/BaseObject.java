package de.telekom.sea7;

public class BaseObject {
	private int id;
	private Object parent;
	
	public BaseObject(int id, Object parent) {
		this.id = id;
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
