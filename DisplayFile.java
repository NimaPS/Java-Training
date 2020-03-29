import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayFile extends JFrame implements ActionListener {
	
	
	
	public void actionPerformed( ActionEvent event)  {
		
		Chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int intt= Chooser.showOpenDialog(this);
		if(intt== Chooser.APPROVE_OPTION) 
		{
			try 
			{
				f=Chooser.getSelectedFile();
				
			 
			 
				if(f.isFile())
				{
					area.setText( "file: "+ f.getName()+ ", path: "+ f.getAbsolutePath()  +", length: "+ f.length());
				}
			 
				if(f.isDirectory())
				{
					myDirectory(f); //myDirectory() is a function
				}  
			}
		
			catch(Exception e)
			{
				System.out.print("error");
			}
			
										}
		else {
			System.out.print("error");
		}
	}
	
	
	
	 public static void main(String []x) throws IOException {
		 new DisplayFile();
	 }
	 public void myDirectory( File dir) {
		 try { String s=new String(" ");
				File[] files = dir.listFiles();
				for (File file : files) {
					if (file.isDirectory()) {
						System.out.println("     file:" + file.getName()+ ", length: "+ file.length());
						  area.setText( " file:" + file.getCanonicalPath());				         
						  myDirectory(file);
					} 
					else {
						
						System.out.println("     file:" + file.getName()+ ", length: "+ file.length());
						
						
						s= s+  "file:" + file.getName()+ ",\nlength: "+ file.length() +",\npath: ";
						s=s+file.getCanonicalPath()+"\n \n";
						  
						  
					}
					area.setText( s);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 
	 private JPanel panel1, panel2;
	 private JButton button;
	 private JLabel label;
	 private JTextArea area;
	 private JScrollPane sc;
	 private JFileChooser Chooser;
	 File f=null;
	 
	 public DisplayFile(){
		 Chooser= new JFileChooser();
		 Chooser.setCurrentDirectory(new File("D:/"));
		 
			this.setVisible(true);
			this.setSize(1000,500);
			this.setTitle("Display File Attributes");
			this.setLayout(new GridLayout (3,5));
			this.setLocation(50,50);
			
			panel1=new JPanel();
			panel2=new JPanel();
			button= new JButton("upload");
			label=new JLabel(" select file to upload");
			area= new JTextArea("", 50,50);
			sc=new JScrollPane(area);
			
			area.setEditable(false);
			
			
			sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			sc.setPreferredSize(new Dimension(900, 250));
			
			panel1.setLayout(new FlowLayout());
			panel1.add(label);
			panel1.add(button);
			this.add(panel1);
			
			
			panel2.setLayout(new FlowLayout());
			panel2.add(sc);
			this.add(panel2);
			
			button.addActionListener(this);
	 }

}
