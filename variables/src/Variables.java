public class Variables {
    public static void main(String[] args){

        System.out.println("hello juan");
//int has a width of 32 2exp 31
        int myFirstNumber = (10 + 5) + (2*10);
        int myMinvalue = -2_147_483_648;
        int myMaxvalue = -2_147_483_647;
        int myTotal = (myMinvalue/2);
        System.out.println("my total is : " + myTotal);
//byte has a width of 8
        byte myByteValue = -128;
        byte myByteValue2 = (byte)(myByteValue/2);
        System.out.println("my byte value is : " + myByteValue2);

        //short has a width of 16
        short myShortValue = 32767;

        //long has a width of 64  2exp63
        long myLongValue = 9_223_372_036_854_775_807L;


     //   System.out.println(myFirstNumber); //sout + tab
     //   System.out.println("myFirstNumber"); //sout + tab

    }
}
