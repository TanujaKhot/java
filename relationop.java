import java.util.Scanner;
class relationop {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two number:");
        Scanner obj= new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("(a>b) is:" +(a>b));
        System.out.println("(a<b) is:" +(a<b));
        System.out.println("(a>=b) is:" +(a>=b));
        System.out.println("(a<=b) is:" +(a<=b));
        System.out.println("(a==b) is:" +(a==b));
        System.out.println("(a!=b) is:" +(a!=b));
    }
}