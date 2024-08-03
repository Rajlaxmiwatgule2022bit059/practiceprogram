import java.io.*;
class createFile1{
public static void main(String args[]) throws IOException{
String str ="sb";
FileWriter fw = new FileWriter("text");
for (int i=0; i<str.length();i++){
fw.write(str.charAt(i));
fw.close();
}
}}
