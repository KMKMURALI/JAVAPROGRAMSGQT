package javaprograms;

import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of class room");
	int m = sc.nextInt();
	System.out.println("Enter the number of students in each class");
	int n = sc.nextInt();
	int arr[][]=new int[m][n];
	System.out.println("array is ready");
	// storing data in array
	for (int i = 0; i < arr.length; i++) {
		System.out.println("the count is students inside class"+(i+1)+"is"+arr[i].length);
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter the marks of student "+(j+1));
			arr[i][j] = sc.nextInt();
					}
		
	}
	//  viewing the data
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("inside class"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("the marks of student "+(j+1)+"is"+arr[i][j]);
			
					}
		
	}
	
	
	
	}

}
