import java.util.Scanner;
public class ThrowDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=10000;
		System.out.println("Enter withdraw amount");
		int withdraw=sc.nextInt();
		try{
			if(balance-withdraw<1000){
				throw new Exception("Balance must be greater than 1000");
			}
			else{
				balance=balance-withdraw;
				System.out.println("New Balance= "+balance);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}