import java.util.Scanner;

class TransposeMatrix {
    public static void main(String[] args) {
        Scanner TransposeMat = new Scanner(System.in);  // for Input 
        System.out.println(" Enter the Rows : ");   //for print name
        int rows = TransposeMat.nextInt();            // for Input the rowsz
        System.out.println(" Enter the Column : ");  // for print name
        int column = TransposeMat.nextInt();            // for Input the column

        System.out.println(" Enter the Matrix By Rows Wise :");   // for  print name


        int matrix[][] = new int[rows][column];   // define the matrix

        // for the Input 
        for ( int i=0; i<rows; i++) {                    // condition for rows
            for (int j =0; j<column; j++) {              // condition for column
                matrix[i][j] = TransposeMat.nextInt();   // for a Matrix
            }
        }
        System.out.println(" The Transpose Matrix is : ");  // for  print


        // For Reverse Matrix
        for (int j=0; j<column; j++) {     // condition for column
            for (int i=0; i<rows; i++) {   // condition for rows
                System.out.print(matrix[i][j] + " ");  // for a Matrix (Not use Println Because Not a In Next Line)
            }
            System.out.println();   // for Print
        }
    }    
}
