package com.olocat.leetcode;

import org.junit.Test;

public class Lc_0007_reverse {
	public int reverse(int x) {
		if(x>=0)
			return Integer.parseInt(new StringBuffer(String.valueOf(x)).reverse().toString());
		else
			return
	}
	@Test
	public void show(){
		System.out.println(reverse(123));
	}
}
