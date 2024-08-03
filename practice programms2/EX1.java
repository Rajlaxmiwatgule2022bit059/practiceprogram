import java.io.*;
class sample{
private String name;
void accept() throws IOException{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter name");
name= br.readLine();
}
void display(){
System.out.println("name= " +name);
}}
class Ex1{
public static void main (String args[]) throws IOException{
sample s = new sample();
s.accept();
s.display();
}
}

