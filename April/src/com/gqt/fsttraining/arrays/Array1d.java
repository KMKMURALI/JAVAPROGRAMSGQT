/**
 
 */
// array : array is a atta structure is used to store similar type of data
//array in java treated as a object
// creation of array:[]is used for determining the dimensuin of array
package com.gqt.fsttraining.arrays;

import java.util.Scanner;

/**
 * @author Mural
 *description : this is code for demonstration of 1d array
 *Requirement: to store marks of n students
 */
public class Array1d {

	/**
	 * 
	 * @param args
	 * @param sc
	 * @param n
	 * @param arr
	 */
	public static void main(String[] args) {
		System.out.println("enter tne number of students");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("arrary is ready for operation");
		System.out.println("the length of array is"+arr.length);
		// this code is to coolect and store the data
				for (int i = 0; i < arr.length; i++) {
					System.out.println("enter the marks of student"+(i+1));
					//storing array type data in ith position
					arr[i]=sc.nextInt();
				}
				
				for (int i = 0; i < arr.length; i++) {
					System.out.println(" the marks of student-"+(i+1)+"+ is: "+arr[i]);
				
				}
	}

}
