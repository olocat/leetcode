package com.olocat.leetcode;

import org.junit.Test;

import java.util.Date;
import java.util.Vector;

public class Lc_1185_dayOfTheWeek {
	public String dayOfTheWeek(int day, int month, int year) {
		if(month==1 || month==2){
			year--;
			month = month+12;
		}
		int w = (day+1+2*month+3*(month+1)/5+year+year/4-year/100+year/400)%7;
		switch (w) {
			case 0:
				return "Sunday";
			case 1:
				return "Monday" ;
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
			default:
				return "";
		}
	}
	public int tex(int d,int m,int y){
		if(m==1 || m==2){
			m = m+12;
		}
		int c = y/100;
		System.out.println(c);
		y = y-c*100;
		System.out.println(y);
		int w = (y+ y/4+c/4- 2*c + (26*(m+1)/10) + d-1)%7;
		return w;
	}
	@Test
	public void text(){
		System.out.println(dayOfTheWeek(1,2,2019));
	}

}
