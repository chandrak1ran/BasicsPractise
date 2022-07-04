package com.asympotic;

public class SumNNumbers {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(sum1(99999));
		long end = System.currentTimeMillis();
		System.out.println("Some sum1 took "+(end-start)+"mil to execute. ("+((end-start)/1000)+" seconds)");
		
		start = System.currentTimeMillis();
		System.out.println(sum2(99999));
		end = System.currentTimeMillis();
		System.out.println("Some sum2 took "+(end-start)+"mil to execute. ("+((end-start)/1000)+" seconds)");

		start = System.currentTimeMillis();
		System.out.println(sum3(99999));
		end = System.currentTimeMillis();
		System.out.println("Some sum3 took "+(end-start)+"mil to execute. ("+((end-start)/1000)+" seconds)");
	}
	
	/**
	 * Uses formula of sum of n numbers
	 * Time complexity is constant
	 * @param n
	 * @return
	 */
	public static int sum1(int n) {
		return n * (n + 1) / 2;
	}
	
	/**
	 * Uses single for loop
	 * Time complexity is n -> Linear Growth 
	 * @param n
	 * @return
	 */
	public static int sum2(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * Uses nested for loop with depth of 2
	 * Time complexity is n^2 -> Quadratic
	 * @param n
	 * @return
	 */
	public static int sum3(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				sum++;
			}
		}
		return sum;
	}
}
