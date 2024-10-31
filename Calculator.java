import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();











        System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5. Remainder");

        int operator = sc.nextInt();

        switch (operator){
            case 1 :
                System.out.println("Addition : " + (a+b));
                break;
            case 2 :
                System.out.println("Substraction : " + (a-b));
                break;
            case 3 :
                System.out.println(" Multiplication :" + (a*b));
                break;
            case 4 :
                System.out.println(" Division :" + (a/b));
                break;
            case 5 :
                System.out.println(" Remainder :" + (a%b));
                break;

            default:
                System.out.println(" Invalid Operator");
        }
    }
}

