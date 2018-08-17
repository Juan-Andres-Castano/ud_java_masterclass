



public class Main {


    public static void main(String[] args)
    {
        Dimension dimensions = new Dimension(20,20,5);

        Case theCase = new Case("220B","Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard myMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor,myMotherboard);

        thePC.getMonitor().drawPixelAt(500,200," red");
        thePC.getMotherboard().loadProgram("windows 1.0 ");
        thePC.getTheCase().pressPowerButton();


    }


}


