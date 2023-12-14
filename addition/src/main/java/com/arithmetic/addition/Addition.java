package com.arithmetic.addition;

import java.util.ArrayList;
import java.util.List;

public class Addition {
	private List<Integer> noLists = new ArrayList<Integer>();
	
	private int num1, num2, result;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public List<Integer> getNoLists() {
		return noLists;
	}

	public void setNoLists(List<Integer> noLists) {
		this.noLists = noLists;
	}	
}
