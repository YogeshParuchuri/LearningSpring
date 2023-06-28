package com.learn.test.lc.xmlconfig;

public class patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void hi() {
		System.out.println("inside init method");
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}

	@Override
	public String toString() {
		return "patient [id=" + id + "]";
	}

	
}
