import java.io.*;
import java.util.*;
class Ep1{
static public void main (String agrs[])throws IOException , NumberFormatException {
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the name,id,age ");
String s = br.readLine();
StringTokenizer st = new StringTokenizer(s);
String s1 = st.nextToken();
String s2= st.nextToken();
String s3= st.nextToken();

 s1 = s1.trim();
 s2 = s2.trim();
 s3 = s3.trim();
 
int n = Integer.parseInt(s1);
System.out.println("ID"+ n);

char sex = (char) br.readLine(s2).charAt(0);
System.out.println("sex"+ sex);


System.out.println("name"+ s3);

}}
