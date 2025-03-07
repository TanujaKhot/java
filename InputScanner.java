import java.util.Scanner;
public class InputScanner {
	
	double var1,var2;
	double sum, a,b;
	
	
	public static void main(String[] args) {

		double var1,var2;
		double sum, a,b;
		// TODO Auto-generated method stub
		Scanner ref =new Scanner(System.in);
		
		System.out.println("Enter value for Variables:");
		a= ref.nextDouble(); 
		b= ref.nextDouble();
		
		sum=a+b;
		System.out.println("Addition Of Two number Is:"+ sum);
		
		
	}

}
