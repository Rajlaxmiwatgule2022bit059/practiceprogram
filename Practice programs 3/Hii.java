import java.io.*;
interface Printer{
 void connect();
 void disconnect();
}
class Ob implements Printer{
public void connect (){
System.out.println("ob connect ");
}
public void disconnect(){
System.out.println("ob dconnect ");
}
}
class Pb implements Printer{
public void connect (){
System.out.println("pb connect ");
}
public void disconnect(){
System.out.println("pb dconnect ");
}
}
class Hii{
public static void main (String args[] )throws Exception{
FileReader f = new FileReader("ol.txt");
LineNumberReader n = new LineNumberReader(f);
String s = n.readLine();
Class c = Class.forName(s);
Printer p = (Printer)c.getDeclaredConstructor().newInstance();
p.connect();
p.disconnect();
}}



