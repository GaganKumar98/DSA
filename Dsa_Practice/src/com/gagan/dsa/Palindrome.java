package com.gagan.dsa;

public class Palindrome {
	
	public boolean palin(int num) {
		int number = 0;
		int newnum = 0;
		int val = num;
		while (num != 0) {
			number = num % 10;
			num = num / 10;
			newnum = newnum * 10 + number;
		}
		if (newnum == val) {
			return true;
		} else {
			return false;
		}

	}

}
