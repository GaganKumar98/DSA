package com.gagan.dsa;

public class Gcd {
	public int getGcd(int num1, int num2) {
		while(num1!=num2) {
			if(num1>num2) {
				num1=num1-num2;
				System.out.println("Number 1 : "+num1);
			}
			else {
				num2=num2-num1;
				System.out.println("Number 2 : "+num2);
			}
		}
		return num1;
	}
	
//Optimised form of GCD
	
	public int OptGcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return OptGcd(b,a%b);
		}
		
	}
// LCM
	public int lcm(int a,int b) {
		return (a*b)/OptGcd(a,b);
	}
}
