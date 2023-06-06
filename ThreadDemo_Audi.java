import java.util.Date;
public class ThreadDemo_Audi{
	public static void main(String[] args) {
		Date dStart=new Date();
		long finalAns=0;
		Addition obj1=new Addition(1,100000000);
		obj1.start();
		Addition obj2=new Addition(100000001,1000000000);
		obj2.start();
		Addition obj3=new Addition(1000000001,1500000000);
		obj3.start();
		Addition obj4=new Addition(1500000001,2000000000);
		obj4.start();

		try{
			obj1.join();
			obj2.join();
			obj3.join();
			obj4.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		Date dEnd=new Date();
		long consolidatedTiming=dEnd.getTime()-dStart.getTime();
		System.out.println("Consolidated Time="+consolidatedTiming);
		finalAns=obj1.ans+obj2.ans+obj3.ans+obj4.ans;
		System.out.println("Final Answer="+finalAns);
	}
}
class Addition extends Thread{
	long start,end,ans;
	public Addition(long start,long end){
		this.start=start;
		this.end=end;
	}

	public void run(){
		Date dStart=new Date();
		for(long i=0;i<=end;i++){
			ans+=i;
		}
		Date dEnd=new Date();
		long time=dEnd.getTime()-dStart.getTime();
		System.out.println("Total of thread= "+ans);
		System.out.println("Total time taken= "+time);
	}
}