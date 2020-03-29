package threads;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Three implements Runnable{
	//displays the list.
	LinkedList c= new LinkedList(Arrays.asList(1,2,3,4,5));
	Random r=new Random(5);
	Object o= new Object();
	public Three(LinkedList s){
		
		synchronized( c) {
			
		c=s;
		System.out.println( "start display");
		for(int i=0; i<c.size(); i++)
		{
			System.out.println( "item "+ i +" is:"+c.get(i));
		}
		System.out.println( "end display");
		try{
		Thread.sleep(1000);
		}
		catch( Exception e) {
			
			System.out.println("no sync in thread three");
		}
			
		}
	}
	
	public void run() {
		System.out.println("thread three");
		
		
	}

}
