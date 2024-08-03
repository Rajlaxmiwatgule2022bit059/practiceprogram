import java.io.*;
class Search{
public static void main(String args[]) throws IOException{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

 System.out.println(" Enter number of countries = ");
 
 int n = Integer.parseInt(br.readLine());
 String str[] = new String[n];
 

for ( int i= 0; i<n ; i++){
System.out.print(" Enter countries name = ");
str[i]= br.readLine();

  }
 
   System.out.println("Enter the country to be searched.");
   String search = br.readLine();
   
   boolean found = false;
    for(int i=0; i<n ;i++){
   if( search.equalsIgnoreCase(str[i])){
   System.out.println(" country found!!  at position" + (i+1) );
   found = true;
   }
   }
   if(!found)
     System.out.println(" not found!! " );
   }
   }
   
   

