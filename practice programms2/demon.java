import java.lang.*;
class Me extends Thread {
String str;
Me(String Str){
this.str = str;
}

public void run(){
//boolean stop = false;
for(int i=0; i<=10;i++){
System.out.println(str+ " " + i);
try{
Thread.sleep(2000);
}
catch(InterruptedException e ){
e.printStackTrace();
}
//if(stop)return;
}
}
}
class demon{
public static void main(String args[]){
Me m = new Me("get ticket");
Me n = new Me("show sit");
Thread t = new Thread(m);
Thread tt = new Thread(n);
t.start();
tt.start();
//System.in.read();
//m.stop = true;

}
}

