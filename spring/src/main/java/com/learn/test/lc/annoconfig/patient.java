package com.learn.test.lc.annoconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void hi() {
		System.out.println("inside init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method");
	}

	@Override
	public String toString() {
		return "patient [id=" + id + "]";
	}

	
}
