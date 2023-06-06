import java.util.Scanner;
public class CustomException{
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
		catch(Exception e){
			System.out.println("Can not divide by zero");
			e.printStackTrace();
		}						
	}

	public static void calculate(int a,int b) throws Exception{
		if(b==0){
			throw new DivideException("You are wrong");
		}
		else{
			int ans=a/b;
			System.out.println("Answer = "+ans);
		}		
	}
}
class DivideException extends Exception{
	public DivideException(String s){
		super(s);
	}	
}