package javaprograms;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
		
		
	try {	
		Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
s1 = s1.toLowerCase();
int vowel_count=0;
int conc_count=0;
for (int i = 0; i<s1.length(); i++) {
	char c = s1.charAt(i);
	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		vowel_count++;
	}
	else {
		conc_count++;
	}
	
}

System.out.println("vowel count is "+vowel_count);
System.err.println("conc count is "+conc_count);

	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("please chec");
		
	}



	

}}
//Scanner sc = new Scanner(System.in);
//String s1 = sc.nextLine();
//String s2 ="";
//for(int i = s1.length()-1;i>=0;i--) {
//	s2 = s2+s1.charAt(i);
//	
//}
//System.out.println(s2);
//if(s1.equals(s2)==true) {
//	System.out.println("palindrome");
//}
//else {
//	System.out.println("not palindrome");
//}
//Scanner sc = new Scanner(System.in);
//String s1 = sc.nextLine();
//s1 = s1.toLowerCase();
//int vowel_count=0;
//int conc_count=0;
//for (int i = 0; i<s1.length(); i++) {
//	char c = s1.charAt(i);
//	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//		vowel_count++;
//	}
//	else {
//		conc_count++;
//	}
//	
//}
//
//System.out.println("vowel count is "+vowel_count);
//System.err.println("conc count is "+conc_count);
//
//
//



