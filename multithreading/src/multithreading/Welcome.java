package multithreading;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ca c=new Ca();
c.start();
	}

}
class Ca extends Thread{
	public void run(){
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String st=s.next();
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
		try {
			System.out.println(c);
			Thread.sleep(15000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
}}