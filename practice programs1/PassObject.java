/* passing object as parameter to methods
import java.lang.*;
class Employee{
 int id ;
Employee(int id)
{
this.id = id;

}
}
class Check{
void swap(Employee obj1 , Employee obj2)
{
Employee temp;
temp= obj1;
obj1= obj2;
obj2 = temp;
//System.out.println(obj1.id +" " +obj2.id);
}
}
class PassObject{
public static void main(String args[]){
Employee obj1 , obj2;
obj1 = new Employee(10);
obj2 = new Employee(20);
Check obj = new Check();
System.out.println(obj1.id +" " +obj2.id);
obj.swap(obj1, obj2);
System.out.println(obj1.id +" " +obj2.id);
}
}
*/

import java.lang.*;
class Employee{
int id1 , id2;
Employee(int id1 , int id2)
{
this.id1 = id1;
this.id2 = id2;

}
}
class Check{
void swap(Employee obj1 )
{
int temp;
temp= obj1.id1;
obj1.id1= obj1.id2;
obj1.id2 = temp;
//System.out.println(obj1.id +" " +obj2.id);
}
}
class PassObject{
public static void main(String args[]){
Employee obj1 , obj2;
obj1 = new Employee(10 ,20);;
Check obj = new Check();
System.out.println(obj1.id1 +" " +obj1.id2);
obj.swap(obj1);
System.out.println(obj1.id1 +" " +obj1.id2);
}
}
