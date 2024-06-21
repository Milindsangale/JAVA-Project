import java.util.Scanner;

class Atm {
    public static void main(String[] args) {
        Scanner ATM = new Scanner(System.in);     // scanner class for input
        int AccountNumber = 123456789;            // AccountNumber
        int ATMPIN = 969992;                      // ATMPIN
        double Balance = 10000.0;                 // lance



        System.out.println(" Enter the Account Number : ");      // print
        int EnterAccountNumber = ATM.nextInt(   );                 // EnterAccountNumber
        System.out.println(" Enter the ATM 6 Digit PIN : ");     // print
        int EnterATMPIN = ATM.nextInt();                           // EnterATMPI

        if ( EnterAccountNumber == AccountNumber && EnterATMPIN == ATMPIN) {    // condition for Account & ATMPIN for Same for not using if Function
            System.out.println(" Login Successful ");            // print
        
            
        
        System.out.println(" 1.check Balance \n 2.withdraw \n 3.Deposit \n 4.Exit \n Enter the choice : ");    // print for choice 
        int choice = ATM.nextInt();                                                                              // For input choice 

        switch (choice) {                                                                          // Function use switch for choice Select
            case 1 : System.out.println("Your balance: $" + Balance);
                break;
            case 2 : System.out.println("Enter withdrawal amount: $");
                Double withdrawalAmount = ATM.nextDouble();                     // for Inter  withdrawalAmount
                if (withdrawalAmount <= Balance ){                              // if condition for withdrawalAmount is less than  Balance
                    Balance -= withdrawalAmount;                                // Balance - withdrawalAmount
                    System.out.println("Withdrawal successful. Updated balance: $" + Balance);  // print +  Balance
                }else {
                    System.out.println("Insufficient funds.");           // withdrawalAmount is less than  Balance then print ("Insufficient funds.")
                    }
                    break;
            case 3 : System.out.println("Enter deposit amount: $");
                    Double depositAmount =ATM.nextDouble();                   // for Inter depositAmount 
                    Balance += depositAmount;                                 // Balance + depositAmount 
                    System.out.println("Deposit successful. Updated balance: $" + Balance);  // print + Balance
                    break;
            case 4 :System.out.println("Thank you for using the ATM. Have a great day!");    //for a Exit
                    break;
                default:
                    System.out.println("Invalid choice.");      //  for Invalid choice
                    
                }
            } else {
                System.out.println("Invalid account number or PIN. Please try again.");  // else condition if statement  line no 18
                
            }
    
            ATM.close();  // for close ATM Scanner And Stop Because you Enter t6he Invalid Account Number and Invalid ATMPIN
        }
    }

    


                    

    
