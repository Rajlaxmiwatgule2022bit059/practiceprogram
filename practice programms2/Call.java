import java.lang.*;
class One {
int i= 10;
public void display(){
System.out.println(i );
}
}
 class Two extends  One {
 int i = 12 ;
 public void display(){
System.out.println(i );
super.display();
}
}
class Call{
public static void main(String args[]){
Two t = new Two ();
t.display();
}
}
