import java.awt.*;
import java.awt.event.*;
  
class cal extends WindowAdapter implements ActionListener 
{  
 Frame f;
 TextField tf;
 String[] m={"1","2","3","4","5","6","7","8","9","+","0","-","*","/","%","","AC","="};
 String s1,temp,temp1,symbol;
 int x,y,z1;
 Button[] z=new Button[18]; 
 cal(String s)
 {    
	 f=new Frame(s);
	 tf=new TextField();
	 tf.setBounds(15,70,300,70);
	 f.add(tf);
	 
	 int h=170;
	 int d=0;
	
	 for(int i=0;i<6;i++)
	 { 
        int w=40;
		for(int j=0;j<3;j++)
		{
	     z[d]=new Button(m[d]);
	     z[d].setBounds(w,h,70,40);
			z[d].addActionListener(this);
			f.add(z[d]);
			w=w+80;
			d++;
		}
		h=h+50;
	 }
	 f.addWindowListener(this);
	 f.setLayout(null);
	 f.setSize(350,500);
	 f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
	 System.out.println("chal gyal guru");
	 String str=e.getActionCommand();
	 if(str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")||str.equals("0"))
	 { 
                 s1=tf.getText();
		 tf.setText(s1+str);
	 }
	 
	 if(str.equals("+"))
	 {
		 temp=tf.getText();
		 tf.setText("");
		 symbol=str;
	 }
	 if(str.equals("="))
	 {
		 if(symbol.equals("+"))
		 {       	 
			 temp1=tf.getText();
			 x=Integer.parseInt(temp);
			 y=Integer.parseInt(temp1);
			 z1=x+y;
			 tf.setText(""+z1);
		 }
	 }
	 if(str.equals("-"))
	 {
		 temp=tf.getText();
		 tf.setText("");
		 symbol=str;
               
	 }
	 if(str.equals("="))
	 {
		 if(symbol.equals("-"))
		 {
			 temp1=tf.getText();
			 x=Integer.parseInt(temp);
			 y=Integer.parseInt(temp1);
			 z1=x-y;
			 tf.setText(""+z1);
		 }
	 }
	 if(str.equals("*"))
	 {
		 temp=tf.getText();
		 tf.setText("");
		 symbol=str;
	 }
	 if(str.equals("="))
	 {
		 if(symbol.equals("*"))
		 {
			 temp1=tf.getText();
			 x=Integer.parseInt(temp);
			 y=Integer.parseInt(temp1);
			 z1=x*y;
			 tf.setText(""+z1);
		 }
	 }
	 if(str.equals("/"))
	 {
		 temp=tf.getText();
		 tf.setText("");
		 symbol=str;
	 }
	 if(str.equals("="))
	 {
		 if(symbol.equals("/"))
		 {
			 temp1=tf.getText();
			 x=Integer.parseInt(temp);
			 y=Integer.parseInt(temp1);
			 z1=x/y;
			 tf.setText(""+z1);
		 }
	 }
	 if(str.equals("%"))
	 {
		 temp=tf.getText();
		 tf.setText("");
		 symbol=str;
	 }
	 if(str.equals("="))
	 {
		 if(symbol.equals("%"))
		 {
			 temp1=tf.getText();
			 x=Integer.parseInt(temp);
			 y=Integer.parseInt(temp1);
			 z1=x%y;
			 tf.setText(""+z1);
		 }
	 }
	 if(str.equals("AC"))
	 {
		 tf.setText("");
		 
	 }
 }
public void windowClosing(WindowEvent e)
{
	System.exit(0);
}
 public static void main(String[] args)
 {
	 new cal("cal");
 }
}