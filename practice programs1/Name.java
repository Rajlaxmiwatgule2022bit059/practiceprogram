import java.io.*;
class Name{
public static void main(String args[]) throws IOException{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

StringBuffer sb = new StringBuffer();
 System.out.println(" Enter number of surname = ");
 String sur = br.readLine();
 System.out.println(" Enter number of midname = ");
 String mid = br.readLine();
 System.out.println(" Enter number of lastname = ");
 String last = br.readLine();
 
 sb.append(sur);
 sb.append(last);
 System.out.println(" surname+lastname = " + sb);
 
 int n = sur.length();
 sb.insert(n,mid);
  System.out.println(" full name = " + sb);
   System.out.println(" Enter correct name = " );
  String surr= br.readLine();
  sb.replace(0,5,surr);
   System.out.println(" corrected name= " + sb);
   sb.reverse();
    System.out.println(" reversed name = " + sb);
  }}
