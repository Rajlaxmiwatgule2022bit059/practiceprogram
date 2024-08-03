import java.lang.*;
class One{
One(){

System.out.println("one");
}
}
class Two extends One{

Two(){

System.out.println("two ");
}

}
class Three1{
public static void main(String args[]){
Two t = new Two ();
}
}


