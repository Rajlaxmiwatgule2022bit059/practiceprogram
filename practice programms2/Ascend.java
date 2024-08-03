import java.io.*;

class Ascend{
public static void main (String args[]) throws IOException
{
 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
 System.out.println("Enter the size");
 int n = Integer.parseInt(br.readLine());
 int num[]= new int[n];
 System.out.println("Enter the elements:");
 for(int i=0; i<= n-1 ; i++){
 num[i] = Integer.parseInt(br.readLine());
 }
 int lm = n-1;
 int temp;
 boolean flag = false;
 for (int i =0 ; i<lm;i++)
 {
 for(int j=0 ; j< lm-i; j++)
 {
  if ( num[j] >num[j+1]){
   temp = num[j];
  num[j] = num[j+1];
  num[j+1]= temp;
  flag = true;
  }
  if ( flag == false)break;
  else flag = false;
  }
  for( i=0; i<n;i++)
    System.out.println(num[i]);
  }
  }}
  
