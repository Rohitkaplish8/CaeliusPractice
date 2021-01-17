package net.codejava;
import java.util.*;

public class Multithreading extends Thread {

	public void run()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		Multithreading m = new Multithreading();
		m.start();
				
		for(int i =0;i<6;i++)
		{
			System.out.println("Hello the thread is running for the "+i+"time");
if(i==3)
{
	m.run();
	break;
}
			m.stop();
		}
	}

}
