public class Thread_Runable{
	public static void main(String[] args) {
		RunableDemo1 r1=new RunableDemo1();
		RunableDemo2 r2=new RunableDemo2();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}
}
class RunableDemo1 implements Runnable{
	public void run(){
		int i=0;
		while(i<50){
			System.out.println("Testing from runnable demo 1");
			i++;
		}
	}
}
class RunableDemo2 implements Runnable{
	public void run(){
		int i=0;
		while(i<50){
			System.out.println("Testing from runnable demo 2");
			i++;
		}
	}
}