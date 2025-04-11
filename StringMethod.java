import java.util.*;
public class StringMethod {

	public static void main(String[] args) {
		System.out.println("Enter  String:");
		Scanner obj=new Scanner(System.in);
		String name=obj.nextLine();
		String Char="   java  "; 
		// TODO Auto-generated method stub
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(Char.trim());
		System.out.println(name.charAt(3));
		System.out.println(name.substring(2,4));




	}

}
