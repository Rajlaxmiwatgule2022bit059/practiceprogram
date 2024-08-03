import java.io.*;
import java.util.*;
class Ec{
static public void main (String args[]) throws IOException{

InputStreamReader in =new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(in);
System.out.print("Enter two number ");
String str = br.readLine();
StringTokenizer st = new StringTokenizer(str, "  ");
String s1 = st.nextToken();
String s2 = st.nextToken();
s1 = s1.trim();
s2= s2.trim();

double n1 = Double.parseDouble(s1);
double n2 = Double.parseDouble(s2);

System.out.println("Add ="+ (n1+n2));
System.out.println("sub ="+ (n1-n2));
System.out.println("mul ="+ (n1*n2));
System.out.println("div ="+ (n1/n2));
}}

