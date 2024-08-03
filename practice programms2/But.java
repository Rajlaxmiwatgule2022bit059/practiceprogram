import java.awt.*;
import java.awt.event.*;
class But extends Frame {

But(){
Button b = new Button("ok");
add(b);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae ){
System.exit(0);
}});
}
public static void main(String args[]){
But bt = new But();
bt.setSize(400,300);
bt.setVisible(true);
}
}

