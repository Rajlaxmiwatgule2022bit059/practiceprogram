import java.io.*;
class CharTest{
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
char ch= (char)br.read();
if(Character.isDigit(ch)){
System.out.println(" is digit ");
}

else if(Character.isUpperCase(ch)){
System.out.println(" is up ");
}
br.skip(2);
}
}



