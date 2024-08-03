import java.lang.*;
class Me {
static {
System.out.println("static bloc 1");}
{

System.out.println("inti bloc 1");}
Me(){
System.out.println("con bloc 1");}
static {
System.out.println("static bloc 2");}
{

System.out.println("inti bloc 2");}
}
 class ME extends Me{
public static void main(String args[]){
System.out.println("main");
Me ob = new Me();
}
}
