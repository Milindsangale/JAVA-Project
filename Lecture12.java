import java.util.*;

class Lecture12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2.Taking Input
        String name = sc.nextLine();          // Taking the input 
        System.out.println(name);              // for print name

        // 3. Concatenation (joining 2 Strings) 
        System.out.println("3.Concatenation (joining 2 Strings) ");   // for a print 
        String Name = "Milind";                                        //  define the String with name
        String Surname = "Sangale";                                    // define the  String  with surname
        String FUllName =  Name +" " + Surname;                         // define the String FUllname( Name + Surname)
        System.out.println("My full Name is : " + FUllName);             // printb the FullName

        // 4. print length of a String
        
        System.out.println("4. print length of a String" + FUllName.length());       // for Print

        // 5.Acces character's of a String
        System.out.println("5.Acces character's of a String");               // for a print
        for ( int i=0 ; i<FUllName.length();i++) {               // using for loop codition (charAt());
            System.out.println(FUllName.charAt(i));
        
        }

        // 6.Compare the string
        System.out.println(" Compare the String");  // print
        String Name1 = sc.nextLine();   // 
        String Name2 = sc.nextLine();  // Input

        if (Name1.compareTo(Name2)==0) {
            System.out.println("Name1 and Name2 are Eual String");   // print 
        }else {
            System.out.println("Name1 and Name2 are not Eual String");  //print
        }

        
        // 5. Substring
        System.out.println(" Substring ");   //print  
        
        
       


    

        
        
    }
    
}
