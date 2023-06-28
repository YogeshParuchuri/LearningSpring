package com.learn.test.reftype;

public class scores {
	private double maths;
	private double science;
	private double social;
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getSocial() {
		return social;
	}
	public void setSocial(double social) {
		this.social = social;
	}
	@Override
	public String toString() {
		return "scores [maths=" + maths + ", science=" + science + ", social=" + social + "]";
	}
	
	
	
}
