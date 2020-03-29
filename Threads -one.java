package threads;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class One implements Runnable{
	
	//randomly adding integers to the list,
	LinkedList a= new LinkedList(Arrays.asList(1,2,3,4,5));
	Random r=new Random();
	int  n = r.nextInt(5) ;
	
	Random x=new Random();
	int  xx = x.nextInt(20) ;
	
	public One(LinkedList s){
		
		synchronized( a) {
			
		a=s;
		System.out.println( "the number " +  xx+ " will be added at the position: "+ n);
		a.add(n, xx);
		System.out.println(" so the linked list after added" +a);
	}
	try{
		Thread.sleep(1000);
		}
		catch( Exception e) {
			System.out.println("no sync in thread one");
		}
		
	}
	
	public void run() {
		System.out.println("thread one");
		System.out.println(a);
		
	}
}
