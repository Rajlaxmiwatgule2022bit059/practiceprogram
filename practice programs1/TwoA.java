import java.util.Scanner;
 class TwoA{
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the no. of rows  and columns = ");
 int n = sc.nextInt();
 int m = sc.nextInt();
  float mat[][] = new float[n][m];
 System.out.println(" Enter the elements in matrix: ");
  for ( int i=0 ; i<n ; i++){
  for ( int j=0 ; j<m; j++){
  mat[i][j]= sc.nextFloat();
  }
  }
  
  System.out.println(" Transpose of  matrix: ");
  
  for ( int i=0 ; i<m ; i++){
  for ( int j=0 ; j< n; j++){
  System.out.print(mat[j][i] +" ");
  }
   System.out.print("\n ");
 }
 sc.close();
 }
 }
 
