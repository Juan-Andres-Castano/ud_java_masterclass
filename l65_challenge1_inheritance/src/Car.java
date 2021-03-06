


public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private boolean isManual;
    private int currentGear;


    public Car(String name, String size, int wheels, int doors, boolean isManual, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }



    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setcurrentGear(): changed to : " + this.currentGear + " gear "  );
    }

    public void changeVelocity(int speed, int direction){

        move(speed,direction);
        System.out.println("Car.changeVelocity(): velocity : " + speed + " direction : " + direction  );
    }

}
