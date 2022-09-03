package com.gagan.dsa;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
/*--------------------Palindrome------------------------------------------- */
//		Palindrome p=new Palindrome();
//		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		System.out.println("Enter the number");
//		n = sc.nextInt();
//		
//		System.out.println(p.palin(n));
/*------------------------------------------------------------------------- */

/*--------------------Factorial------------------------------------------- */
//		Factorial fact= new Factorial();
//		int n = 0;
//		System.out.println("Enter the number");
//		n = sc.nextInt();
//		System.out.println(fact.fact(n));
//		System.out.println("recursion : "+fact.recFact(n));
/*------------------------------------------------------------------------- */

/*--------------------Trailing Zero------------------------------------------- */

//		TrailingZero tz= new TrailingZero();
//		int n=0;
//		System.out.println("Enter the number");
//		n = sc.nextInt();
//		System.out.println(tz.zeroCount(n));
/*------------------------------------------------------------------------- */

/*--------------------GCD(Greatest common divisor)------------------------------------------- */
//
//		Gcd gd = new Gcd();
//		int n1, n2 = 0;
//		System.out.println("Enter 1st number");
//		n1 = sc.nextInt();
//		System.out.println("Enter 2nd number");
//		n2 = sc.nextInt();
//		System.out.println(gd.getGcd(n1, n2));
/*------------------------------------------------------------------------- */
		
/*--------------------GCD(Greatest common divisor) Optimized form ------------------------------------------- */
//		Gcd gd = new Gcd();
//		int n1, n2 = 0;
//		System.out.println("Enter 1st number");
//		n1 = sc.nextInt();
//		System.out.println("Enter 2nd number");
//		n2 = sc.nextInt();
//		System.out.println(gd.OptGcd(n1, n2));
		
/*------------------------------------------------------------------------- */
		
/*--------------------LCM(Least common Multiple)------------------------------------------- */
//		System.out.println("LCM");
//		Gcd gd = new Gcd();
//		int n1, n2 = 0;
//		System.out.println("Enter 1st number");
//		n1 = sc.nextInt();
//		System.out.println("Enter 2nd number");
//		n2 = sc.nextInt();
//		System.out.println(gd.lcm(n1, n2));
		
/*------------------------------------------------------------------------- */
		
/*--------------------Prime Number------------------------------------------- */
		
//		System.out.println("Prime Number");
//		PrimeNumber pn = new PrimeNumber();
//		int n1=0;
//		System.out.println("Enter 1st number");
//		n1 = sc.nextInt();
//		System.out.println(pn.isPrime(n1));
		
/*------------------------------------------------------------------------- */
		
/*--------------------Prime Number------------------------------------------- */

//		System.out.println("Prime Factor");
//		PrimeFactor pf= new PrimeFactor();
//		int n1=0;
//		System.out.println("Enter number");
//		n1 = sc.nextInt();
//		pf.primeFactor(n1);
		
/*------------------------------------------------------------------------- */

/*--------------------Divisor of Number------------------------------------------- */
//		System.out.println("Divisor of number");
//		DivisorOfN dn= new DivisorOfN();
//		int n1=0;
//		System.out.println("Enter number");
//		n1 = sc.nextInt();
//		System.out.println("Divisor of "+n1);
//		dn.printDivisor(n1);
/*------------------------------------------------------------------------- */
/*--------------------Divisor of Number------------------------------------------- */
//		System.out.println("Computing Power");
//		ComputingPower cp = new ComputingPower();
//		int n1=0;
//		System.out.println("Enter number ");
//		n1 = sc.nextInt();
//		int n2=0;
//		System.out.println("Enter Power");
//		n2 = sc.nextInt();
//		System.out.println(cp.power(n1, n2));
		
/*------------------------------------------------------------------------- */	
/*-------------------- Iterative Power------------------------------------------- */
		System.out.println("Ierative Power");
		IterativePower ip = new IterativePower();
		int n1=0;
		System.out.println("Enter number ");
		n1 = sc.nextInt();
		int n2=0;
		System.out.println("Enter Power");
		n2 = sc.nextInt();
		System.out.println(ip.power(n1, n2));
/*------------------------------------------------------------------------- */	
		
//		Scanner sc= new Scanner(System.in);
//		int size=0;
//		System.out.println("Main Class Method");
//		size=sc.nextInt();
////		int[] nameArr=new  int[size];
//		String[] name= new String[size];
//		for(int i=0;i<name.length;i++) {
//			System.out.println("Enter the name "+i+" : " );			
//			name[i]=sc.nextLine();
//		}
//		System.out.println("-----------------------------------");
//		for(int i=0;i<name.length;i++) {
//			System.out.println(name[i]);
//		}
//		System.out.println("-----------------------------------");
	}

}
