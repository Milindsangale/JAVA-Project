 class BitManipulation {

    public static void main(String[] args) {
        // GeT Bit
        // Get the 3rd bit (possition =2) of a number n (n= 0101) 
        // Bit Mask : 1<i
        // operator : AND
    

        int n =5;
        int pos = 3;
        int bitMask = 1<<pos;

        if(( bitMask & n)==0) {
            System.out.println("Bit was Zero");

        }else{
            System.out.println("Bit was One");

        }
;    }
}
