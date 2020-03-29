import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MyCalc extends JFrame implements ActionListener{
	JLabel num1 , num2 , l;
	JButton add , sub, div , mul , answer , cancel;
	JTextField numb1 , numb2, ans;


	MyCalc(){

	JFrame j= new JFrame(" my claculator ");


	j.setSize(300,300);
	j.setLayout(new FlowLayout());

	 num1= new JLabel ("The First Number");
	 num2= new JLabel ("The Second Number");
	 l = new JLabel(" choose an opertion : ");


	 add = new JButton(" + ");
	 sub = new JButton(" - ");
	 div = new JButton(" / ");
	 mul = new JButton(" * ");
	 answer=new JButton(" Answer");
	 cancel = new JButton (" cancel");


	 numb1=new JTextField(" ", 5);
	 numb2=new JTextField(" ", 5);
	 ans= new JTextField( " " , 5 );
	ans.setEditable( false);

	j.add( num1);
	j.add(numb1);
	j.add(num2);
	j.add(numb2);
	j.add(l);
	j.add(add);
	j.add(sub);
	j.add(div);
	j.add(mul);
	j.add(answer);
	j.add(ans);
	j.add(cancel);

	j.show();
	 add.addActionListener(this);
	 sub.addActionListener(this);
	 div.addActionListener(this);
	 mul.addActionListener(this);
	 answer.addActionListener(this);
	 cancel.addActionListener(this);


}


 public void actionPerformed( ActionEvent e){

	 if (e.getSource()== cancel)
	 {
		 System.gc();
		 System.exit(0);
	}

	else if (e.getSource()==answer )
	 { String s1= numb1.getText();
	   String s2=numb2.getText();
	   if ( s1.length() < 1 || s2.length() <1){
		   JOptionPane.showMessageDialog( this , " error ");
	   }}

	else if (e.getSource()== add){
		 String s1 = numb1.getText();
		  String s2 = numb2.getText();
		  double x1=Double.parseDouble(s1);
		  double x2=Double.parseDouble(s2);
		 double x3=x1+x2;
		 ans.setText( " "+x3);
	  }
	  else if (e.getSource()== sub){
	  		 String s1 = numb1.getText();
	  		  String s2 = numb2.getText();
	  		  double x1=Double.parseDouble(s1);
	  		  double x2=Double.parseDouble(s2);
	  		 double x3=x1-x2;
	  	//	 String s3= (String)x3; error :|
	  		 ans.setText(" "+ x3);
	  	  }
	else if (e.getSource()== mul){
			 String s1 = numb1.getText();
			  String s2 = numb2.getText();
			  double x1=Double.parseDouble(s1);
			  double x2=Double.parseDouble(s2);
			 double x3= (x1 * x2 );
			 ans.setText(" " + x3);
		  }
	else if (e.getSource()== div){
			 String s1 = numb1.getText();
			  String s2 = numb2.getText();
			  double x1=Double.parseDouble(s1);
			  double x2=Double.parseDouble(s2);
			double  x3=x1 / x2;
			ans.setText( " "+x3);
		  }

}

	 public static void main( String args[]){
		 System.out.println (" HI above" );
		  new MyCalc();
		  System.out.println (" HI below" );

	  }

}

