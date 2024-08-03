// perimitive datatype in methods
import java.lang.*;
class Pri{
public void swap(int num1 , int num2){
int temp;
temp = num1;
num1 = num2;
num2 = temp;
}
}
class Pre extends Pri{
public static void main(String[] args){
int num1 = 10 ;
int num2 = 20;
Pri p = new Pri();
System.out.println(num1 +" " +num2);
p.swap(num1, num2);
System.out.println(num1 +" " +num2);
}
}
