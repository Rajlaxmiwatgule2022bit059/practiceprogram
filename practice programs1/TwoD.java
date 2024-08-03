import java.io.*;
 class TwoD{
 public static void main(String args[])throws IOException{
 BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
 System.out.println("Enter the no. of rows = ");
 int n = Integer.parseInt(br.readLine());
 System.out.println("Enter the no. of columns = ");
 int m = Integer.parseInt(br.readLine());
  
 float arr[][] = new float[n][m];
  for (int i = 0 ;i<n ; i++){
   for ( int j=0 ; j<m ;j++){
  arr[i][j] = Integer.parseInt(br.readLine());
  }
  }
  for (int i = 0 ;i<n ; i++){
   for ( int j=0 ; j<m ;j++){
  System.out.print(arr[i][j]+ "\t");
  }
   System.out.println();
  }
  }}
