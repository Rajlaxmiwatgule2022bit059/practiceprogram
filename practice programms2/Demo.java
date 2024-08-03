import java.io.*;
class Person {

private String name;
private int age;

Person(String s , int i ){
name =s ;
age = i;


}
public void check(){
if( age == 30 ){
System.out.println("my age ");
}
else System.out.println(" not my age ");

}}



class Demo{
public static void main(String args[]) {
 String s = args[0];
 String n = args[1]; 
 int i = Integer.parseInt(n);
 
 Person p = new Person(s,i);
 p.check();
 }
 }
 
