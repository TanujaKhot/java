
public class staticvariable {
 int a=30;
 static int c=30;
 static int d=30;

	public static void main(String[] args) {
		
		int b=10;
		staticvariable obj= new staticvariable();
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(c);
		obj.Add();
// TODO Auto-generated method
	}
  public void Add() {
	  
	  System.out.println(d);
  }
  

	 }
