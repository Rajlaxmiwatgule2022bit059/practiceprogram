import  java.lang.*;

 class Local {
private int x;
public void modify(int x){
this.x = x;
}
public void access (){
System.out.println(x);
//System.out.println(a);
}
/*static{
System.out.println("static block");
}

static void display(int num)
{
System.out.println(num);}
*/
public static void main(){
 //System.out.println("main block");
 //Local.display(13);
Local l = new Local ();
l.modify(2);
l.access();

}
}
 
