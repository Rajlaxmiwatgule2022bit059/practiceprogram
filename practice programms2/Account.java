import java.io.*;
class Account{
private double bal;

Account( double bal){
this.bal = bal;
}

void check(double r) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a password");
String pass = br.readLine();
if (pass.equals("xyz")){
Interest in = new Interest(r);
in.interest();
}
else System.out.println("sorry !! not authorized");
}
private class Interest{
private double r;
private double intr;
Interest (double r){
this.r=r;
}

void interest(){
intr = bal * r/100;
bal += intr;
System.out.println("Balance =" + bal);
}
}
public static void main(String args[]) throws IOException{
Account s = new Account(100000);
s.check(9.5);



}
}

