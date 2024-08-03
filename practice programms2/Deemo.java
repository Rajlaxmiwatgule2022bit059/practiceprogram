import java.lang.*;
class Myclass{
int x;
Myclass(int x){
this.x = x;
}
}
class KnowName{
static void printName(Object obj){
Class c = obj.getClass();
String name = c.getName();
System.out.println(name);
}
}
class Deemo {
public static void main(String args[]){
Myclass obj = new Myclass(3);
KnowName.printName(obj);
}
}
