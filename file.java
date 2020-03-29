package file;

import java.io.File;
import java.io.IOException;

public class file {
	public static void main(String []args) throws IOException {
		
		File f=null;
		try {
			
			f=new File("C:\\Users\\dellu\\Desktop\\Camera\\input.txt");
			if (f.exists()){
				System.out.println(f.length());
				System.out.println(f.getName());
				System.out.println(f.getParent());
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
				System.out.println(f.getAbsolutePath());
				
				if(f.isDirectory()) {
					System.out.println("\n"+f.getName()+"list");
					File ff[]=f.listFiles();
					for(int i=0; i<ff.length;i++) {
						System.out.print(ff[i]);
						System.out.print(ff[i].getName());
						System.out.println("");
				}
					
				}
				
			}
			else {
				System.out.println("not exist");
			}
		}catch(Exception e) {
			System.out.println("Exception");
		}
	}

}











