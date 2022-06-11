//01 06 11 16 21 
//01 07 12 17 22
//03 08 13 18 23
//04 09 14 19 24 
//05 10 15 20 25

public class pattern3 {
public static void main(String[] args) {
	int count;
	for(int i=1;i<=5;i++) {
		count=i;
		for(int j=1;j<=5;j++) {
			System.out.print(count);
			System.out.print("	"); 
			count=count+5;
		}
		System.out.println("	"); 
	}
	
}
}
	




