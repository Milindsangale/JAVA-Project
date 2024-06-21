import java.util.Scanner;

class PatternProblems {
    public static void main(String[] args) {
        
    // 1.Solid Rectangle
    // outer loop(rows)
    for (int i=0; i<=6; i++) {
        // inner loop (colums)
        for (int j=0; j<=6; j++) {
            System.out.print(" * ");    // print In line
        }
        System.out.println();  // print in next line
    }



    // 2.Hollow rectangle
    Scanner PatternProblems = new Scanner(System.in);
    System.out.println(" Enter the rows : ");
    int n = PatternProblems.nextInt();
    System.out.println(" ENter the columns : ");
    int m = PatternProblems.nextInt();
     //outer loop (rows)
     /**  for ( int i=0 ;i<n; i++) {
        // inner loop (columns)
        for( int j=0; j<m;j++) {
            if (i==1 || j==1 || i==n || j==m) {
                System.out.print(" * ");
            }else {
            }
        }
        System.out.println();
     } */


     // 3. Half Pyramidal
     System.out.println("3. Half Pyramidal");
     for (int i=0; i<=n ;i++) {
        for(int j=1;j<=i;j++) {
            System.out.print(" * ");
        }
        System.out.println();
     }
     


     // 4.Inverted Half Pyramidal
     System.out.println("4.Inverted Half Pyramidal");
     for (int i=1; i>=n ;i--) {
        for(int j=1;j<=i;j++) {
            System.out.print(" * ");
        }
        System.out.println();
     }




    }

    
}
