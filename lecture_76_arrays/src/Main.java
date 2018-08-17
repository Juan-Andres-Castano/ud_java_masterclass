import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        int[] myVariable;
        myVariable= new int[10];
        myVariable[0] = 50;
        myVariable[1] = 50;
        myVariable[5] = 50;
        int[] myVariable2 = {1,2,3,4,5,6,7,8,9,0 };


        double[] myDoubleVariable= new double[10];
        System.out.println(myVariable[5]);


        //for(int i=0; i<10; i++){
        for(int i=0; i<myVariable.length; i++){
            myVariable[i] = i*10;
        }


        printArray(myVariable);
/************************************************************************************/
    int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("element "+i+ ", typed value was " + myIntegers[i]);
        }

        System.out.println( "the average is " + getAverage(myIntegers));


    }


    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("element " + i + ", value is " + array[i]);
        }

    }



    /*1************************************************************************************/
    private static Scanner scanner = new Scanner(System.in);
    public static int[] getIntegers(int number){
        System.out.println("enter " + number + "integer values \r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static double getAverage(int[] array){
        int sum =0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }

}
