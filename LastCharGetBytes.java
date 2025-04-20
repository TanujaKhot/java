import java.util.Vector;

public class LastCharGetBytes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Vector<String> myve=new Vector<String>();
		myve.add("pune");
		myve.add("London");
		myve.add("pune");
		myve.add("London");
		System.out.println("Vector:"+myve);
		System.out.println(myve.lastIndexOf("pune"));
		System.out.println(myve.lastIndexOf("London"));

		String str="The JJMCOE Jaysingpur";
		System.out.println(str.matches("(.*)(JJMCOE)(.*)"));

		byte[] arr=str.getBytes();
		System.out.println("Ihe String Is;");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);

		}
	}

	}

