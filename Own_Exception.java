public class Own_Exception{
	static int currentBal = 5000;
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		try{			
			withdraw(amount);
		}catch(Exception e){
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}
	public static void withdraw(int amount) throws Exception{
		int newBal=currentBal-amount;
		if(newBal<1000){
			throw new MyException("Darshan Exception");
		}
		else{
			System.out.println("New Balance="+newBal);
		}
	}
}
class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}