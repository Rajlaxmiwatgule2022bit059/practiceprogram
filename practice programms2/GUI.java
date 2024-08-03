import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
class Me extends Frame implements ActionListener{
Button a , b, c, d;
TextField t1,t2 ,t3;
Label l1, l2, l3;

Me(){
setLayout(new FlowLayout());
l1 = new Label ("Number 1 : ");
t1 = new TextField();
l2 = new Label ("Number 2 : ");
t2 = new TextField();
a = new Button ("+");
b = new Button ("-");
c = new Button ("*");
d = new Button ("/");
l3 = new Label ("Result : ");
t3 = new TextField();
add(l1);
add(t1);
add(l2);
add(t2);
add(a);
add(b);
add(c);
add(d);

a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
);
}
public void actionPerformed(ActionEvent ae){
Double num1 = Double.parseDouble(t1.getText());
Double num2 = Double.parseDouble(t2.getText());
Double result=0.0;
if(ae.getSource() == a ){
 result = num1 + num2;
}
if(ae.getSource() == b ){
 result = num1 - num2;
}
if(ae.getSource() == c ){
 result = num1 * num2;
}
if(ae.getSource() == b ){
 result = num1 / num2;
}

t3.setText(String.valueOf(result));
}


public static void main(String args[]){
Me m = new Me();
m.setTitle("SggsFin Calculator");
m.setSize(400,300);
m.setVisible(true);
}
}



