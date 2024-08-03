class ex{
static void main(String args[]){
try{
System.out.println("Opern file");
int n =args.length;
System.out.println("n= " +n);
int a = 45/n;
System.out.println("a=" +a );
int b[]={ 1 ,3, 5};
b[50]=100;
}
catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
finally{
System.out.println("close files");
}}
}

