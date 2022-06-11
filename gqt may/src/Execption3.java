import java.util.Scanner;

public class Execption3 {
	static public void main (String...args) {
	try {Scanner sc = new Scanner(System.in);
	System.out.println("Arithmetic operation started");
	System.out.println("enter num1");
	int num1 = sc.nextInt();
	System.out.println("enter num2");
	int num2 = sc.nextInt();
	int res = num1/num2;
	System.out.println("result is :"+res);
	
	System.out.println("arithmetic operation ended");
	
	System.out.println("array ops started");
	System.out.println("enter array size");
	int size = sc.nextInt();
	System.out.println("enter position no");
	int pos =sc.nextInt();
	System.out.println("enter value to be addded");
	int val = sc.nextInt();
	
	int arr[] = new int[size];
	arr[pos]=val;
	System.out.println("array ops complted");
	}
	catch (Exception e) {
		System.out.println("exception handled");
	}
	
	}
	
	
		
	}
	


