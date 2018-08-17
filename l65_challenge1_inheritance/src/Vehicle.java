


public class Vehicle {

private String name;
private String size;
private int velocity;
private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity = 0;
        this.currentDirection = 0;
    }
    public Vehicle(String name, String size, int velocity, int currentDirection) {
        this.name = name;
        this.size = size;
        this.velocity = velocity;
        this.currentDirection = currentDirection;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle steer(): Steering at: " + currentDirection + " degress "  );
    }

    public void move(int velocity, int direction){
        this.velocity = velocity;
        this.currentDirection = direction;
        System.out.println("vehicle move(): Moving at: " + this.velocity + " in direction " + this.currentDirection  );
    }

    public void stop(){
        this.velocity = 0;

        System.out.println("vehicle stop " );
    }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
