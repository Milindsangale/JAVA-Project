class Lecture13 {
    public static void main(String[] args) {
        // 1. Declaration 
        StringBuilder FUllName = new StringBuilder("Milind Sangale");
        System.out.println(FUllName);

        // 2.get a charactor from index
        System.out.println(FUllName.charAt(0));

        // 3. set a charactor at index
        FUllName.setCharAt(0, 'O');
        System.out.println(FUllName);

        // 4. Insert a charactor at some Index
        FUllName.insert(0, 'P');
        System.out.println(FUllName);

        // 5. delet charactyor at somne Index
        FUllName.delete(0, 5);
        System.out.println(FUllName);

        // 6. Append the Charactor means add Somthing at the end
        FUllName.append(" DYPCOE ");
        System.out.println(FUllName);
   
        // 7. Print length of a string
        System.out.println(FUllName.length());    

    }
    
}
