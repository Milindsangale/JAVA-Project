public class GanpatiName {
    public static void main(String[] args) {
         // Define the name "Ganpati"
         String name = "GANPATI";

         // Print each letter in the name using asterisks
         for (int i = 0; i < name.length(); i++) {
             char letter = name.charAt(i);
             printLetterPattern(letter);
         }
     }
 
     public static void printLetterPattern(char letter) {
         switch (letter) {
             case 'G':
                 System.out.println("  *****  ");
                 System.out.println(" *       ");
                 System.out.println(" *   *** ");
                 System.out.println(" *     * ");
                 System.out.println("  *****  ");
                 break;
             case 'A':
                 System.out.println("   ***   ");
                 System.out.println("  *   *  ");
                 System.out.println("  *****  ");
                 System.out.println(" *     * ");
                 break;
             case 'N':
                 System.out.println(" *     * ");
                 System.out.println(" **    * ");
                 System.out.println(" * *   * ");
                 System.out.println(" *  *  * ");
                 System.out.println(" *   **  ");
                 break;
             case 'P':
                 System.out.println(" *****   ");
                 System.out.println(" *    *  ");
                 System.out.println(" *****   ");
                 System.out.println(" *       ");
                 System.out.println(" *       ");
                 break;
             case 'T':
                 System.out.println(" ******* ");
                 System.out.println("    *    ");
                 System.out.println("    *    ");
                 System.out.println("    *    ");
                 System.out.println("    *    ");
                 break;
             case 'I':
                 System.out.println(" *****   ");
                 System.out.println("   *   ");
                 System.out.println("   *   ");
                 System.out.println("   *   ");
                 System.out.println(" *****  ");
                 break;
             default:
                 System.out.println("Unknown letter: " + letter);
         }
         System.out.println(); // Add a blank line between letters
    }
    
}
