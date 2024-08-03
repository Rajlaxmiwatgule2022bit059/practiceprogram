import java.io.*;
class Ep{
static public void main (String agrs[])throws IOException , NumberFormatException {
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

System.out.println("Enter the ID ");
int id = Integer.parseInt(br.readLine());

System.out.println("Enter the M/F ");
char sex = br.readLine().charAt(0);

 
System.out.println("Enter the name ");
String name = br.readLine();

System.out.println("id = "+ id);
System.out.println("sex = "+ sex);
System.out.println("name = "+ name);


}}
