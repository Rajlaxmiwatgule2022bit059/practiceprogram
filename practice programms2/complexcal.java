class complexNumber{
     double real;
     double imag;
 public complexNumber (double real ,double imag){
  this.real=real;
  this.imag=imag;
  }
 public double getR(){
  return real;
 }
public double getIm(){
 return imag;
}
 public string toString(){
  return real + "+" +imag + "i";
}
 public static complexNumber add (complexNumber num1 ,complexNumber num2){
  double realpart=num1.getR()+num2.getR();
  double imaginarypart= num1.getimag() + num2.getimag();
  return new complexNumber(realpart,imaginarypart);
 }

public class calculator {

    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);
        ComplexNumber result = new ComplexNumber(0, 0);
        do {
            double realPart, imaginaryPart;
            char operator;

            System.out.print(" ");
            realPart = scanner.nextDouble();

            System.out.print(" ");
            imaginaryPart = scanner.nextDouble();

            ComplexNumber num1 = new ComplexNumber(realPart, imaginaryPart);

            System.out.print(" ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter real part: ");
            realPart = scanner.nextDouble();

            System.out.print("Enter imaginary part: ");
            imaginaryPart = scanner.nextDouble();

            ComplexNumber num2 = new ComplexNumber(realPart, imaginaryPart);

            switch (operator) {
                case '+':
                    result = ComplexNumber.add(num1, num2);
                    break;
                
            }

            System.out.println("Result: " + result);

      System.out.println("Do you want to perform more operations? 'y' for yes, 'n' for no");
            choice = scanner.next().charAt(0);

        } while (choice == 'y');
        scanner.close();
    }
}
}

