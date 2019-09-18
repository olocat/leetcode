package com.olocat.leetcode;

import org.junit.Test;

import java.util.HashMap;

public class Lc_0001_twoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				res[1] = i;
				res[0] = map.get(nums[i]);
				return res;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return null;
	}
	@Test
	public void text(){
		int[] nums = new int[]{3,4,-3,0};
		int[] show = this.twoSum(nums,0);
		for (int i : show) {
			System.out.println(i);
		}
	}
}
