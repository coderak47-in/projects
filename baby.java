import java.awt.*;
import java.awt.event.*;
class baby extends WindowAdapter implements ActionListener 
{
	Frame f;
	 TextField tf;
	 TextArea ta;
	 Button b;
	 
	  baby(String s) {
		  f=new Frame(s);
		     ta=new TextArea();
			 tf=new TextField();
			 ta.setBounds(15,70,600,400);
			 Color c=new Color(150,150,150);
			 ta.setBackground(c);
			 tf.setBackground(c);
			 tf.setBounds(50,500,300,40);
			 b=new Button("Send");
			 b.setBounds(400,500,100,30);
			 b.setBackground(Color.GREEN);
			 f.add(b);
			 f.add(tf);
			 f.add(ta);
			 b.addActionListener(this);
			  f.addWindowListener(this);
	 f.setLayout(null);
	 f.setSize(700,600);
	 f.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
 {
	 System.out.println("chal gyal guru");
	 String str=e.getActionCommand();
	 String s1=tf.getText();
	 
	 ta.append("You ->"+s1 +"\n");
	
	 if(s1.equals("hi")||s1.equals("hello")||s1.equals("hii"))
	 {
		 ta.append("AI:- hi how are u\n");
	 }
	 if(s1.equals("hey"))
	 {
		 ta.append("AI:- hello how are u\n");
	 }
	 if(s1.equals("kaise ho"))
	 {
		 ta.append("AI:- Fine and what about u\n");
	 }
	 if(s1.equals("what is your name"))
	 {
		 ta.append("AI:- My name is AI, made by Rockstar Aman\n");
	 }
	 if(s1.equals("who is aman"))
	 {
		 ta.append("AI:- Aman is my father which is made me and he is a software engineer \n");
	 }
	  if(s1.equals("chutiye"))
	 {
		 ta.append("AI:- tum chutiye tumhare abba chutiye\n");
	 }
	 if(s1.equals("bhosdike"))
	 {
		 ta.append("AI:- tum bhosdiwale tumhare abba bhosdiwale tumhare dada bhosdiwale\n");
	 }
	 if(s1.equals("where are you live"))
	 {
		 ta.append("AI:- i am from india\n");
	 }
	 if(s1.equals("when you born"))
	 {
		 ta.append("AI:- i was born february 2021\n");
	 }
	 if(s1.equals("what about varanasi"))
	 {
		 ta.append("AI:- varanasi is a emotion, it is called devnagari\n");
	 }
	 
	 tf.setText("");
	 
	 
 }
	  public void windowClosing(WindowEvent e)
	  {
	  	System.exit(0);
	  }
	public static void main(String[] args)
	 {
		new baby("baby");
	 }
}
