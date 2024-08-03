import java.lang.*;
class One {

public void calculate(double x){
System.out.println(x*x);
}
}
 class Two extends  One {
 int i = 12 ;
 public void calculate(double x){
System.out.println(x*x*x );

}
}
class calculate{
public static void main(String args[]){
Two t = new Two ();
t.calculate(5);
}
}
