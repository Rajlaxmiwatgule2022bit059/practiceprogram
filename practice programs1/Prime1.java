import java.io.*;
 class prime{
 
 static boolean prime(long num){
 boolean flag = true;
 for(int i= 2 ; i<= num-1 ;i++)
 if (num % i == 0)flag = false;
 return flag ;
 }
 
 
 static void generate(int n ){
 long  num= 2;
for (int i=0 ; i<n; i++){
 if(prime(num))
 {
 System.out.println(num);
 }
 ++num;
 }
 }
 }
 class Prime1{
 public static void main(String args[]) throws IOException{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("how many number?");
 int n = Integer.parseInt(br.readLine());
 prime.generate(n);
 }
 }
