

public class Fish extends Animal{

private int gills;
private int eyes;
private int find;


    public Fish(int brain, int body, int size, int weight, String name, int gills, int eyes, int find) {
        super(brain, body, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.find = find;
    }

    public Fish(int size, int weight, String name, int gills, int eyes, int find) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.find = find;
    }


    private void rest(){


    }

    private void moveMuscles(){


    }
    private void moveBackFin(){


    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}
