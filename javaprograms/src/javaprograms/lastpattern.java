package javaprograms;

import java.util.Scanner;

public class lastpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                      // 3d array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of university");
		int l = sc.nextInt();
		System.out.println("Enter the no of colleges");
		int m = sc.nextInt();
		System.out.println("enter the count of classrooms in each college");
		int n= sc.nextInt();
		System.out.println("enter the count of  students in each classromm in each colleege ");
	int o = sc.nextInt();
	int arr[][][][] =new int[l][m][n][o]; // array object
	// code for collecting the data 
	for (int i = 0; i < arr.length; i++) {
		System.out.println("inside the univrsity "+i);
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("inside the college"+j);
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.println("inside the class"+k);
				for (int m1 = 0; m1 < arr[i][j][k].length; m1++) {
					System.out.println("the marks of student "+(m1+1));
					arr[i][j][k][m1]= sc.nextInt();
					
				}
			}
		}
		for (int i1 = 0; i1 < arr.length; i1++) {
			System.out.println("inside the univrsity "+i1);
			for (int j = 0; j < arr[i1].length; j++) {
				System.out.println("inside the college"+j);
				for (int k = 0; k < arr[i1][j].length; k++) {
					System.out.println("inside the class"+k);
					for (int m1 = 0; m1 < arr[i1][j][k].length; m1++) {
						System.out.println("the marks of student "+(m1+1)+"is"+arr[i1][j][k][m1]);
						
						
					}
				}
			}
			
		
		
		
		
	}
	
		
	
	
	
	
	
	}
}}
//package javaprograms;
//
//import java.util.Scanner;
//
//public class lastpattern {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//                      // 3d array
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no of colleges");
//		int m = sc.nextInt();
//		System.out.println("enter the count of classrooms in each college");
//		int n= sc.nextInt();
//		System.out.println("enter the count of  students in each classromm in each colleege ");
//	int o = sc.nextInt();
//	int arr[][][] =new int[m][n][o]; // array object
//	// code for collecting the data 
//	for (int i = 0; i < arr.length; i++) {// colleges
//		System.out.println("inside the colege:   "+i);
//		for (int j = 0; j < arr[i].length; j++) {//class roomes
//			System.out.println("inside the class:" +j);
//			for (int k = 0; k < arr[i][j].length; k++) {// students
//				System.out.println(" enterthe marks of student "+(k+1));
//				arr[i][j][k] = sc.nextInt();
//				
//			}
//			// code for printing
//		
//			
//		}
//		
//	}
//	for (int i = 0; i < arr.length; i++) {// colleges
//		System.out.println("inside the colege:   "+i);
//		for (int j = 0; j < arr[i].length; j++) {//class roomes
//			System.out.println("inside the class:" +j);
//			for (int k = 0; k < arr[i][j].length; k++) {// students
//				System.out.println(" The student "+(k+1)+"marks is"+arr[i][j][k]);
//			
//				
//			}
//			// code for printing
//		
//			
//		}
//		
//	}
//	
//	
//	
//	}
//}










