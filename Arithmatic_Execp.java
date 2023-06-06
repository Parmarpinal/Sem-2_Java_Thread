import java.util.Scanner;
public class Arithmatic_Execp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			calculate(a,b);	
			System.out.println("HELLO");
		}
		catch(ArithmeticException e){
			System.out.println("Can not divide by zero");
		}						
	}

	public static void calculate(int a,int b) throws ArithmeticException{
		int ans=a/b;
		System.out.println("Answer = "+ans);
	}
}