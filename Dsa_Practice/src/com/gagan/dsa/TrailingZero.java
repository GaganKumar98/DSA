package com.gagan.dsa;

public class TrailingZero {
	public int zeroCount(int num) {
		int Count=0;
		for(int i=5;i<=num;i=i*5) {
			Count=Count+num/i;
		}
		return Count;
	}
}
