import java.lang.*;
class Sample{
private  double num1;
private double num2;
/* for initializtation of instance variable
Sample(double a ,double b){
num1 = a;
num2 = b;
}

/* with no parameter and return statement
public void add(){ 
System.out.println("two number are : "+ num1 +" " +num2 );
double res = num1 + num2;
System.out.println("Result of two numbers are : "+ res);
}*/

/* with return statement
public double add(){
System.out.println("two number are : "+ num1 +" " +num2 );
double res = num1 + num2;
return res;
}*/

// with return statement plus parameters to method
public double add(double a , double b){
num1= a;
num2= b;
System.out.println("two number are : "+ num1 +" " +num2 );
double res = num1 + num2;
return res;

}
}
class Samp{
public static void main(String args[]){
Sample s = new Sample();
double result = s.add(3.4 , 5.6);
System.out.println("Result of two numbers are : "+ result);

}
}


