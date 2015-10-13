package com.accenture.gitflowdemo;

import org.apache.commons.math.util.MathUtils;

public class IntCalculator {
	
	public int add(int x, int y) {
		return MathUtils.addAndCheck(x, y);
	}
	
	public int subtract(int x, int y) {
		return MathUtils.subAndCheck(x, y);
	}
	
}
