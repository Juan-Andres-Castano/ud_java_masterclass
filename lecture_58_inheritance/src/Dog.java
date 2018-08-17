

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.coat = coat;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog.chew() class called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() class called");
        chew();
        super.eat();

    }

    public void walk(){
        System.out.println("Dog walk ");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog run "  );
        move(5);
    }

    public void moveLegs(int speed){
        System.out.println("Dog move legs " + speed  );

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move "  );
        moveLegs(speed);
        super.move(speed);

    }
}
