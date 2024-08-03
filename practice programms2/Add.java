import java.lang.*;
class Add {
 public static void main(String args[]){
 int n = args.length;
 System.out.println(" Addition of Two numbers = ");
 for( int i= 0; i<n ; i++){
 System.out.println(args[i]);
 }
 String s1 = args[0];
 String s2 = args[1];
 /*int a1 = Integer.parseInt(s1);
  int a2 = Integer.parseInt(s2);*/
 
System.out.println(" Result = " + (s1+s2));
}}
