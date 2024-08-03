import java.lang.*;
class Jagged{
public static void main(String args[]){
 int arr[][] = new int[2][];
  arr[0] = new int[2];
  arr[1] = new int[3];
   
   arr[0][0]= 10;
   arr[0][1]= 11;
    
    arr[1][0]= 12;
     arr[1][1]= 13;
      arr[1][2]= 14;
      
      for ( int i=0; i< 2;i++)
     {
     System.out.print(arr[0][i]+",");
     }
      System.out.println();
      for ( int j=0; j< 3;j++)
     {
     System.out.print(arr[1][j]+",");
     }
     
     }
     }
