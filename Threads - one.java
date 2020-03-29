package threads;

import java.util.Arrays;
import java.util.LinkedList;

public class Threadss {
	
	public Threadss() {
		
	}
	
	public static void main(String []s) {
		LinkedList l=new LinkedList(Arrays.asList(1,2,3,4,5));
		
		One one=new One(l);
		Two two= new Two(l);
		Three three=new Three(l);
		
		Thread t1=new Thread(one);
		Thread t2=new Thread(two);
		Thread t3=new Thread(three);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
