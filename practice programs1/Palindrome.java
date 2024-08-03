import java.io.*;
class Palindrome{
public static void main(String args[]) throws IOException{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
String str = br.readLine();
String temp = str;
  StringBuffer sb = new StringBuffer(str);
  sb.reverse();
  if ( sb.toString().equalsIgnoreCase(temp)){
  System.out.println("Is palindrome number");
  }
  else System.out.println("not palindrome number");
  }
  }
  
