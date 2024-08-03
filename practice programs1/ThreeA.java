import java.util.Scanner;

 class ThreeA{
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter no. of department , students and subjects =");
 int n = sc.nextInt();
 int m = sc.nextInt();
 int r = sc.nextInt();
 int stuMarks[][][] = new int[n][m][r];
 for(int k=0; k< n ; k++){
  for ( int i=0 ; i<m ; i++){
  for ( int j=0 ; j< r; j++){
 stuMarks[k][i][j] = sc.nextInt();
 }
 }
 }
  for(int k=0; k< n ; k++){
  System.out.println("Department "+(k+1));
  for ( int i=0 ; i<m ; i++){
   System.out.print("Student "+(i+1)+" marks =");
    for ( int j=0 ; j< r; j++){
  
  System.out.print(stuMarks[k][i][j]);
   
 }
 for ( int j=0 ; j< r; j++){
  int total=0;
  total+= stuMarks[k][i][j];
   System.out.print("Total:" + total);
  System.out.println();
  
 }
   System.out.println();
 }}}}
 
