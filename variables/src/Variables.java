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
// float = 32 (4 bytes)
        // double 64 ( 8 bytes) --recommended to use
        float myFloat = 5.25f;

        double mydouble = 5d;

        float my2floa = (float)mydouble;
        System.out.println("my float value is : " + myFloat);

        System.out.println("my double value is : " + mydouble);

        int myFirstNumber2 =  5/2;
        float valie = 5f / 2f ;

        //  System.out.println(myFirstNumber); //sout + tab
        System.out.println("myFirstNumber2 is "+myFirstNumber2); //sout + tab
        System.out.println("my valie value is : " + valie);

        int ik = calculateScore(true,34,2);

        //calculateScore(true,2,12);
        if(ik==2){
            System.out.println("my YEPP ");
        }
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted){




        char myChar = '\u00A9';
        System.out.println("my myChar value is : " + myChar);

        boolean myBoolean = false;

        String myString = " this is a string";
        System.out.println("my myString value is : " + myString);
        myString = myString + " and more. " ;
        System.out.println("my myString value is : " + myString);
        myString = myString + "\u00A9 2015. " ;
        System.out.println("my myString value is : " + myString);
            if(gameOver){
                int finalSore = score * 100;

                System.out.println("my finalScore value is : " + finalSore);
                System.out.println("my levelCompleted value is : " + levelCompleted);

                double kilometers = (100 * 1.64564);
            }

            return 2;
    }

}
