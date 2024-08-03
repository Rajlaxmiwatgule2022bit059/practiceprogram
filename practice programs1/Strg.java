import java.lang.*;
 class Strg{
 public static void main(String args[]){
 String s1 = "well";
 String s2 = new String("come!!");
 char ch[] = { 'T' ,'h', 'a' ,'n','k','s' };
 String s3 = new String(ch);
 String s8= new String("Thanks");
 String s10="is";
 String s9= new String ("my name is rajlaxmi");
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 
 int n = s1.length();
 System.out.println("Length of s1 :" + n);
 
 String s4 = s1.concat(s2);
 System.out.println(s4);
 
 int s5 = s2.compareTo(s3);
 System.out.println("s2 compares to s3 :");
 if (s5 > 0){
 System.out.println("positive");
 }
 else  System.out.println("negative");
 
 boolean s6 = s1.equalsIgnoreCase(s3);
 System.out.println("s1 equals s3 true or false =" + s6);
 
 boolean s7= s2.startsWith("c");
 System.out.println("s8 Start with s8 true or false =" + s7);
 
 int s11 = s9.indexOf(s10);
  System.out.println("index =" + s11);
  
 String s12 = s9.substring(8,12);
 System.out.println("new String = " + s12);
 
 char chs[] = new char[30];
 s9.getChars( 8 , 15 , chs , 0 );
 System.out.println(chs);
 
 String s13 ="  new vault  ";
 String s = s13.trim();
 System.out.println("Trimed = " + s13);
  
  String arr[];
 arr = s9.split(" ");
 System.out.println(arr);
 
 }}
