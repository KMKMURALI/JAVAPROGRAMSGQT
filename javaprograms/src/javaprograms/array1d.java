package javaprograms;

import java.util.Iterator;
import java.util.Scanner;

public class array1d {

	public static void main(String[] args) {
		System.out.println("enter the number of students");
Scanner sc = new Scanner(System.in);
int n  = sc.nextInt();
int arr[] = new int[n];
System.out.println("array is ready for operation");
// giving input to array
for (int i = 0; i < arr.length; i++) {
	System.out.println("Enter the marks of student"+(i+1));
arr[i]= sc.nextInt();
}
// displaying marks of student
for (int i = 0; i < arr.length; i++) {
	System.out.println("marks of student"+(i+1)+"is"+arr[1]);
}

}
	}


