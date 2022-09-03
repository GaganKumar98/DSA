package com.gagan.dsa;

public class Factorial {
public long fact(int num) {
	long number=1;
	
	for(int i=2;i<=num;i++) {
		number=number*i;
	}
	return number;
}
public long recFact(int num) {
	if(num==0) {
		return 1;
	}
	return num*recFact(num-1);
}
}
