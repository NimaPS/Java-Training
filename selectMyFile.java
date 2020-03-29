package selectMyFile;

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

public class selectMyFile extends JFrame implements ActionListener {
	
	 
	private JTextArea area;
	 private JScrollPane scroll;
	 private JFileChooser select;
	 File theFile=null;
	 private JButton thebutton;
	 private JLabel thelabel;
	 
	 
	 public selectMyFile(){
		 
		 
			
			
			
			this.setVisible(true);
			this.setSize(1000,500);
			this.setTitle(" File Chooser");
			this.setLayout(new FlowLayout ());
			this.setLocation(50,50);
			area= new JTextArea("  ", 50,50);
			scroll=new JScrollPane(area);
			
			area.setEditable(false);
			
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			select= new JFileChooser();
			 select.setCurrentDirectory(new File("c:/"));
			thebutton.addActionListener(this);
			
			thebutton= new JButton("click");
			thelabel=new JLabel(" click the button");
			add(thelabel);
			add(thebutton);
			add(area);
			
			
			
	 }
	 
	 
	 
	
	
	
	public void actionPerformed( ActionEvent event)  {
		
		select.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int intt= select.showOpenDialog(this);
		if(intt== select.APPROVE_OPTION) {
			try {
				theFile=select.getSelectedFile();
				
			 
			 
				if(theFile.isFile()){
					area.setText( "file: "+ theFile.getName()  +" length: "+ theFile.length());
				}
				if(theFile.isDirectory()){
				 
					
					myDirectory(theFile);//myDirectory() is a function
					}}
		
			catch(Exception e){
				System.out.print("error");}}
		else {
			System.out.print("error");}}
	
	
	
	
	 
	 public void myDirectory( File folder) {
		 try { String str=new String();
				File[] files = folder.listFiles();
				for (File file : files) {
					if (file.isDirectory()) {
						  area.setText( " file:" + file.getCanonicalPath());				         
						  myDirectory(file);} 
					else {
						
						str= str+  "file:" + file.getName()+ "\nlength: "+ file.length() ;
						  
						  
					}
					area.append( str);
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	 
	 
	 
	 
	 public static void main(String []str) throws IOException {
		 selectMyFile dis= new selectMyFile();
	 }
	 
	 


}
