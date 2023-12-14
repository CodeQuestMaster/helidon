package com.arithmetic.addition;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdditionBLogic {
		public int execute(int a, int b) {
			System.out.println(" AdditionBLogic.execute(" + a + "," + b + ")");
			return a + b;
		}
		
		public int executeList(List<Integer> noLists) {
			int result = 0;
			for(Integer i : noLists) {
				result = result + i;
			}
			return result;
		}

}
