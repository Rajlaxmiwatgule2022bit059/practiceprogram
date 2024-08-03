import java.lang.*;
class One {
void calculate(int x){
System.out.println(x*x);
}
class Two extends One{
 void calculate(int x){
System.out.println(x*x*x);
}
public static void main(String args[]){
One o = new One ();
Two t = new Two();
One ref = o ;
ref.calculate(2);
ref = t ;
ref.calculate(2);
}
}
}
