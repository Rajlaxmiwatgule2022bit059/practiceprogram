import java.io.*;

class Array{
 static public void main(String args[])throws IOException{
 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
  try { System.out.println("Enter the number of subjects:");
  int n = Integer.parseInt(br.readLine());
  int marks[] = new int[n];
  int total = 0;
 System.out.println("Enter the marks in each sub");
 for(int i=1 ; i <=n; i++){
 marks[i] = Integer.parseInt(br.readLine());
 total += marks[i];
 }
 float per = (float)total/n;
 
 System.out.println("Total marks :"+ total);
 System.out.println("Total percentile :"+ per +"%");
 } 
 catch ( NumberFormatException e){
 System.out.println(e);
 }}}
