import java.awt.*;
import java.awt.event.*;
class Java extends Frame implements ActionListener{
Button b , c, d, e;
Java(){

setLayout(new FlowLayout());
b = new Button("+");
 c = new Button("-");
 d = new Button("*");
 e = new Button("/");

add(b);
add(c);
add(d);
add(e);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
);

}
public void actionPerformed(ActionEvent ae){
if(ae.getSource() == b ) setBackground(Color.green);
if(ae.getSource() == c ) setBackground(Color.pink);
if(ae.getSource() == d ) setBackground(Color.magenta);
if(ae.getSource() == e ) setBackground(Color.yellow);
}
public static void main(String args[]){

Java f = new Java();
f.setSize(400,300);
f.setVisible(true);
f.setTitle("SggsFin Calculator");

}
}

