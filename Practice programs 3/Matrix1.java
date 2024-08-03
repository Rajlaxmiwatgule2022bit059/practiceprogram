import java.io.*;
import java.util.*;
class Matrix{
int arr[][];
 int r ,c ;
 Matrix(int r, int c){
 this.r=r;
 this.c= c;
 arr = new int [r][c];
 } 

int[][] getMatrix() throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 for (int i =0 ; i<r ;i++){
 String str = br.readLine();
StringTokenizer st = new StringTokenizer (str, " " );
for (int j=0; j<c;j++){
 arr[i][j]= Integer.parseInt(st.nextToken());
}
return arr ;
}
}

int[][] findsum(int a[] [], int b[][])
{
int temp[][] = new int[r][c];
for(int i=0; i<r;i++){
for(int j=0;j<c;j++){
temp[i][j]= a[i][j]+b[i][j];
}
}
return temp;
}

void display(int res[][])
{
for(int i=0; i<r;i++){
for(int j=0;j<c;j++){
System.out.print(res[i][j]);
}
System.out.println();
}
}
}
class Matrix1{
public static void main(String args[]) throws IOException{
Matrix m = new Matrix(3, 3);
Matrix n = new Matrix (3 , 3);
System.out.print("Enter frist matrix =");
int x[][]=m.getMatrix();
 System.out.print("Enter second matrix =");
int y[][]=n.getMatrix();
int z[][] = m.findsum(x,y);
System.out.print("sum of matrix =");
n.display(z);
}
}


















