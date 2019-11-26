package multithreading;
import java.util.Scanner;
public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		Student s1=new Student();
		Student1 s2=new Student1();
		t.start();
		s1.start();
		s2.start();
	}

}
class Teacher extends Thread{
	public void run() {
		int i;
		for(i=0;i<=5;i++)
		{
			if(i==1) yield();
			System.out.println("Teacher is teaching");
		}
	}}
class Student extends Thread{
	public void run() {
		int i;
		for(i=0;i<=5;i++)
		{
			if(i==2)stop();
			System.out.printf("Student %d is studying\n",i);
		}
	}}
class Student1 extends Thread{
	public void run() {
		int i;
		for(i=3;i<=5;i++)
		{
			System.out.printf("Student %d is sleeping\n",i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}}
