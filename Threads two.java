package threads;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;



public class Two implements Runnable {
	// randomly deleting from a list
	LinkedList b= new LinkedList(Arrays.asList(1,2,3,4,5));	

	
	
	Random r=new Random();
	int  n = r.nextInt(5) ;
	
	Random x=new Random();
	int  xx = x.nextInt(20) ;
	
	public Two(LinkedList s){

		synchronized( b) {
		b=s;
		System.out.println("linked list before delelte" +b);
		System.out.println("we will delete the item: "+ b.remove(n));
		System.out.println("linked list after delelte" +b);
		}
		try{
			Thread.sleep(1000);
			}
			catch( Exception e) {
				System.out.println("no sync in thread two");
			}
	
		
	}
	
	
	
	
	public void run() {
		System.out.println("thread two");
		
	}

}
