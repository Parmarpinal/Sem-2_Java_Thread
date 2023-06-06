import java.util.Scanner;
public class NegativeException{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter Number: ");
		a=sc.nextInt();
		try{
			calculate(a);	
		}
		catch(Exception e){
			e.printStackTrace();
		}						
	}

	public static void calculate(int a) throws Exception{
		if(a<0){
			throw new NegException("You can not apply negative value");
		}
		else if(a>0){
			System.out.println("Positive");
		}
		else{
			System.out.println("Zero");
		}		
	}
}
class NegException extends Exception{
	public NegException(String s){
		super(s);
	}	
}