import java.util.Scanner;
public class ThrowEasy{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,ans=1;
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			calculate(a,b);	
			System.out.println("HELLO");
		}
		catch(Exception e){
			System.out.println("Can not divide by zero");
			System.out.println(e.getMessage());
		}						
	}

	public static void calculate(int a,int b) throws Exception{
		if(b==0){
			throw new Exception("You are wrong");
		}
		else{
			int ans=a/b;
			System.out.println("Answer = "+ans);
		}		
	}
}