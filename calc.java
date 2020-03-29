package calc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

		public class calc extends JFrame implements ActionListener{
			
			private JPanel p,p1,p2,p3, p4, p5, p6;
			private JButton binary, octal, hexa, decimal;
			private JLabel label1,label2,label3;
			private JTextField f;
			private JLabel bin, oct, hex,dec;
			private JTextField binf, octf,hexf, decf;
			
			public calc(){
				this.setVisible(true);
				this.setSize(800,400);
				this.setTitle("Calculator");
				this.setLayout(new GridLayout (3,5));
				this.setLocation(50,50);
				
			
			binary=new JButton("Binary");
			hexa=new JButton("Hexadecimal");
			octal= new JButton("Octal");
			decimal=new JButton("decimal");
			
			f=new JTextField ();
			label1=new JLabel("choose the label that your number in ");
			label2=new JLabel("enter your number please ");
			hexa.addActionListener(this);
			binary.addActionListener(this);
			octal.addActionListener(this);
			decimal.addActionListener(this);
			f.addActionListener(this);
			
	
			
			
			
			
			
			//auto 
			bin=new JLabel("Binary");
			hex=new JLabel("Hexadecimal");
			oct= new JLabel("Octal");
			dec=new JLabel("decimal");
			
			binf=new JTextField ();
			hexf=new JTextField ();
			octf=new JTextField ();
			decf=new JTextField ();
			
			p1=new JPanel(new FlowLayout());
			p1.add(label1);
			p1.add(binary);
			p1.add(  hexa   );
			p1.add(octal);
			p1.add( decimal);
			
			
			p2=new JPanel(new GridLayout(1,2));
			f.addActionListener(this);
			p2.add(label2);
			p2.add(f);
			
			
			p3=new JPanel(new GridLayout(4,2));
			
			
			 
				
			p3.add(bin);
			p3.add(binf);
			p3.add(hex);
			p3.add(hexf);
			p3.add(dec);//hona
			p3.add(decf);
				
		
			
			
			this.add(p1);
			this.add(p2);
			this.add(p3);
			
			
			
			}			
			
			
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource()==hexa ) {
				//	p.setVisible(false);
					
				}
				
				else if(e.getSource()==binary) {p1.setVisible(false);}
				else if(e.getSource()==octal) {p1.setVisible(false);}
				else if(e.getSource()==decimal) {p1.setVisible(false);}
			}
			
			
			public int hexaToDecimal() { return 1;}
			
			
			public int hexaToBinary() { return 1;}
			
			
			public int hexaToOctal() { return 1;}
			
			
			public int decimalToBinary() { return 1;}
			
			
			public int decimalToHexa() { return 1;}
			
			
			public int decimalToOctal() { return 1;}
			
			
			public int octalToBinary() { return 1;}
			
			
			public int octalToHexa() { return 1;}
			public int octalToDecimal() { return 1;}
			
			
		public static void main(String [] args ) {
			
		calc a =new calc();
		
		}
		}