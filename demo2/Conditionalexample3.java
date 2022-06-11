
// pattern programing
// 
//public class Conditionalexample3 {
	//public static void main(String[] args) {
		//for( int =1;i<=4;i++)
		//System.out.println("*");
	
		
	//}

//}
//*
//*
//*
//*
//public class Conditionalexample3 {
//	public static void main(String[] args) {
	//	for( int =1;i<=4;i++)
		//System.out.println("*");
	
		
	//}

//}
//*****
//*****
//*****
//*****
//*****
// nested loops 
// when ever we are have two enteties we want to use nested for
// row  i= 1 2 3 4 5
// col j = 5 5 5 5 5
//public class Conditionalexample3 {
	//public static void main(String[] args) {
		//for(int i =1;i<=5;i++) {
			//for (int j =1;j<=5;j++) {
				//System.out.print("*");
			//}
		//	System.out.println( );
		//}
	//}
		
		
	//}
//*
//**
//***
//****
//*****
// row : 1 2 3 4 5
// col j:1 2 3 4 5
 //public class Conditionalexample3 {
//	public static void main(String[] args) {
	//	for(int i =1;i<=5;i++) {
		//	for (int j =1;j<=i;j++) {
			//	System.out.print("*");
			//}
		//System.out.println( );
	//	}
//	}
 //}
//******
//****
//***
//**
//*
//row : 1 2 3 4 5
//col j:5 4 3 2 1
// public class Conditionalexample3 {
	//public static void main(String[] args) {
		//for(int i =1;i<=5;i++) {
			//for (int j =5;j>=i;j--) {
				//System.out.print("*");
			//}
		//System.out.println( );
		//}
	//}
//}
// 1 1 1 1 1
// 2 2 2 2 2
//  3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5
// what ever row number same is to be printed
//row : 1 2 3 4 5
//col j:5 4 3 2 1
 //public class Conditionalexample3 {
	//public static void main(String[] args) {
		//for(int i =1;i<=5;i++) {
			//for (int j =1;j<=5;j++) {
			//System.out.print(i);
			//}
		//System.out.println( );
	//	}
	//}
//}
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 45
 // 1 2 3 4 5
 // 1 2 3 45 
 
 
 
 
 
 // public class Conditionalexample3 {
	//public static void main(String[] args) {
		//for(int i =1;i<=5;i++) {
			//for (int j =1;j<=5;j++) {
			//System.out.print(j);
			//system.out.print(" ");
			//}
		//System.out.println();
		//}
	//}
//0 1 02 03 04 05 
//06 07 08 09 10
//11 12 13 14 15 
//16 17 18 19 20
//21 22 23 24 25

//public class Conditionalexample3 {
	//public static void main(String[] args) {
		//int count =1;
		//for(int i =1;i<=5;i++) {
			//for (int j =1;j<=5;j++) {
			//System.out.print(count);
			//System.out.print(" ");
			//count++;
			//}
		//System.out.println();
		//}
//	}
//}
// rever numbers
			
//25 23 23 22 21 
//20 19 18 17 16 
//15 14 13 12 11
//10 09 08 07 06
//06 04 03 03 01

//public class Conditionalexample3 {
	//public static void main(String[] args) {
		//int count= 25;
		//for(int i =1;i<=5;i++) {
		//	for (int j =1;j<=5;j++) {
			//System.out.print(count);
			//System.out.print(" ");
			//count--;
			//}
		//System.out.println();
	//	}
	//}
//}
//1 6 11 16 21
//2 7 12 17 22 
//3 8 13 19 23 
//4 9 14 20 24
//5 10 15 21 25
//public class Conditionalexample3 {
	//public static void main(String[] args) {
	//	int count;
		//
		//for(int i =1;i<=5;i++) {
			//count =i;
			//for (int j =1;j<=5;j++) {
			//System.out.print(count);
			//System.out.print(" ");
			//count=count+5;
			//}
		//System.out.println();
		//}
//	}
//}
// zeroes getting printed by 
//0 1 02 03 04 05 
//06 07 08 09 10
//11 12 13 14 15 
//16 17 18 19 20
//21 22 23 24 25
		public class Conditionalexample3{
			static public void main(String...args) {
			
			int count =1;
			for (int i=1;i<=5;i++) {
				for (int j =1;j<=5;j++) {
					if (count<10) {
						System.out.print("0");
					System.out.print(count);
					System.out.print("	");
					count++;
					}
					else {
						System.out.print(count);
						System.out.print(" 	");
						count++;
					}
				}
				
				
				System.out.println("");
			}
			
			}
		}
		
		



































