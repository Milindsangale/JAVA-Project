import java.util.Scanner;

 class Calculator {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);        // Scanner for the Input
        System.out.println("Enter the value of a : ");    // for print
        int a = Calculator.nextInt();                      // for input value a
        System.out.println("Enter the value of b : ");   // for print
        int b = Calculator.nextInt();                      // for input value b


        System.out.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division ");  //  for Understanding the Sequence of Variable


        int Variable = Calculator.nextInt();      // forr Input the Variablr

        switch (Variable) {         // used for Switch 
            case 1: System.out.println(" Addition : " + (a+b));            // for addition
                break;
            case 2: System.out.println(" Subtraction : " + (a-b));        // for Subtraction
                break;
            case 3: System.out.println(" Multiplication : " + (a*b));    // for Multiplication 
                break;
            case 4: System.out.println(" Division : " + (a/b) );         // for Division 
                break;


            default:                                                 // for a invalid Syntax
            System.out.println(" Invalid Variable ");            // for a print 
                break;                                             // break the Statement 
        }
        
    }
    
}
