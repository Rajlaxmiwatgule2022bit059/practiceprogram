class Sample {
static void demo(){
try{
System.out.println("inside demo ");
throw new NullPointerException (" jhfkas");
}
catch (NullPointerException e)
{
System.out.println(e);
}
}
}
class Demothrow{
public static void  main (String args[])
{
Sample.demo();
}
}
 
