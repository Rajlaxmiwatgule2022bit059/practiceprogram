import java.io.*;
class File{
public static void main(String agrs[]) throws Exception{
DataInputStream dt = new DataInputStream(System.in);
FileOutputStream f = new FileOutputStream("file.txt");
char ch = (char)dt.read();
f.write(ch);
}
}
