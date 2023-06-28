package com.learn.test.reftype;

public class student {
	private scores scores;

	public scores getScores() {
		return scores;
	}

	public void setScores(scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "student [scores=" + scores + "]";
	}
	
}
