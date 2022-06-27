package com.learnarrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		
		//int[] tmp = reverseArr01(a);
		//int[] tmp = reverseArr02(a);
		int[] tmp = reverseArr03(a);
		
		
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}
	
	/**
	 * 
	 * Reverse using extra array
	 * Iterate from backwards
	 * @param a
	 * @return
	 */
	public static int[] reverseArr01(int[] a) {
		int cnt = 0;
		int[] tmp = new int[a.length];
		
		for (int i = a.length - 1; i >=0; i --) {
			tmp[cnt] = a[i];
			cnt++;
		}
		
		return tmp;
	}
	
	/**
	 * 
	 * Reverse using extra array
	 * Use the logic pointing 1st element to last element
	 * @param a
	 * @return
	 */
	public static int[] reverseArr02(int[] a) {
		int[] tmp = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			tmp[i] = a[a.length-1-i];
		}
		return tmp;
	}
	
	/**
	 * 
	 * Reverse array withou using extra array
	 * Uses temp variable
	 * @param a
	 * @return
	 */
	public static int[] reverseArr03(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		return a;
	}
}
