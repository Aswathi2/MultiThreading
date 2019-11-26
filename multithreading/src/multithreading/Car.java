package multithreading;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car1 c1=new Car1();
Car2 c2=new Car2();
Car3 c3=new Car3();
c1.start();
c2.start();
c3.start();
	}

}
class Car1 extends Thread{
	public void run() {
		int i;
		for(i=0;i<=5;i++)
		{
			if(i==1) yield();
			System.out.println("CAR A IS RUNNING");
		}
	}}
	class Car2 extends Thread{
		public void run() {
			int i;
			for(i=0;i<=5;i++)
			{
				if(i==2)stop();
				System.out.println("CAR B IS RUNNING");
			}
		}
	}
	class Car3 extends Thread{
		public void run() {
			int i;
			for(i=0;i<=5;i++)
			{
			try {
				System.out.println("CAR C IS RUNNING");
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
			System.out.println(e);
			}
			}
		}
	}