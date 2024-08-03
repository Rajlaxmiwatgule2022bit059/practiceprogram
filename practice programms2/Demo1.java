import java.lang.*;
class Demo{
private String name ;
 private  int age  ;
 Demo(String s , int i){
 name = s;
 age = i;

 }
void talk(){
System.out.println("my name is "+name);
System.out.println("my age is "+age);
}
}
class Demo1{
public static void main(String args[]){
Demo m = new Demo("ria",20);
m.talk();
Demo n = new Demo("rajlaxmi",21);
n.talk();
}
}

