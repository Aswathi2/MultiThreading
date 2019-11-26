package multithreading;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.start();
	}

}
class C extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
		try {
			System.out.println("THREAD IS STARTED");
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("THREAD IS RUNNING "+i+" TIME");
		System.out.println(i);
		
	}
}}