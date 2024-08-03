import java.lang.*;
class One{
int i;
One(int i ){
this.i=i;
}
}
class Two {
int i ;
Two(int a , int b)
{
 super(a);
 i= b;
}
void show(){
System.out.println(i );
System.out.println(super.i );
}
}
class Three{
public static void main(String args[]){
Two t = new Two (3 ,4 );
t.show();
}
}

