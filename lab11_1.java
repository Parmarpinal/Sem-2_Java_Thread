public class lab11_1{
	public static void main(String[] args) {
		Mythread1 t1=new Mythread1();
		Mythread2 t3=new Mythread2();
		Thread th1=new Thread(t3);
		t1.start();
		th1.start();
	}
}
class Mythread1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Hello from Mythread-1 " + (i+1));
			try{
				sleep(800);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class Mythread2 implements Runnable{
	public void run(){
		Thread t=new Thread();
		for(int i=0;i<10;i++){
			System.out.println("Hello from Mythread-2 " + (i+1));
			try{
				t.sleep(800);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}