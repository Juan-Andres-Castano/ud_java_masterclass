



public class Main {


    public static void main(String[] args)
    {
        Dimension dimensions = new Dimension(20,20,5);

        Case theCase = new Case("220B","Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard myMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor,myMotherboard);

        thePC.powerUp();



        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("est");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("nborth");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 2, 24,3,4);
        Lamp lamp = new Lamp("Classic", false, 4);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4,ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}


