import java.lang.*;
class Instance{
static int x;
static void display(){
System.out.println(" x = " + x );
}
public static void main(String srgs[]){
Instance i = new Instance ();
Instance k = new Instance();
i.x = 11;
++i.x;
i.display();
k.display();
}
}
