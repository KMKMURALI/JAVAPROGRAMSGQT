package javaprograms;

public class stringp1 {

	public static void main(String[] args) {
String s1 ="RajaRamMohanRoy";
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.startsWith("Raja"));
System.out.println(s1.endsWith("Roy"));
System.out.println(s1.contains("Roy"));
System.out.println(s1.charAt(13));
System.out.println(s1.length());
System.out.println(s1.indexOf('R'));
System.out.println(s1.concat("india"));
System.out.println(s1.getClass());
System.out.println(s1.isBlank());
System.out.println(s1.lastIndexOf('a'));
System.out.println(s1.lastIndexOf("Ra"));
System.out.println(s1.lastIndexOf('a',4));
System.out.println(s1.replace('a','o'));
System.out.println(s1.replace("Mohan","kohan"));
System.out.println(s1.trim());
System.out.println(s1.toCharArray());
 char[] c = s1.toCharArray();
 for (int i = 0; i < c.length; i++) {
	 System.out.print(c[i]+",");
	
}

	}

}
