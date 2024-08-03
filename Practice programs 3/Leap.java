import java.io.*;

class Leap{

public static void main (String args[]) throws 	IOException {

BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
System.out.print("Enter the year");
int n = Integer.parseInt(br.readLine().trim());
if(n% 100 == 0 && n % 400==0)
{
System.out.print("leap year");
}
else if(n % 100 != 0 && n %4 ==0 ){
System.out.print("leap year");
}
else {
System.out.print("not leap year");
}
}
}

