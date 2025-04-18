import java.util.*;
public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="I Learn Java";
		String str3="I Learn Java";
		String str2="I am Dancer";
		String str4="I AM DANCER";

		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str2.compareToIgnoreCase(str4));
        StringBuilder str5=new StringBuilder("I am Java Learner");
        str5.insert(4, "C#");
		System.out.println(str5);


	}

}
