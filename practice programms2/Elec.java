import java.lang.*;
class Commerical{
 String name;
void setName(String name){
this.name = name ;
}
String getName(){
return name;
}

void calculateBill(int units){
System.out.println("Name = " + getName());
System.out.println("Bill ammount =" + ( units* 5.00));

}

}


class Domestic extends Commerical{

void calculateBill(int units){
System.out.println("Name = " + getName());
System.out.println("Bill ammount =" + ( units* 2.50));
}

}
class Elec{
public static void main(String args[]){
Commerical c = new Commerical();
c.setName("raj");
c.calculateBill(300);
Domestic d = new Domestic();
d.setName("ria");
d.calculateBill(100);
}
}

