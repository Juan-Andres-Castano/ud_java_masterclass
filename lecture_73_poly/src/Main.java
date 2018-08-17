public class Main {

    public static void main(String[] args) {
    Car car = new Car(8, "Base Car");
        System.out.println( car.accelerate() );
        System.out.println( car.accelerate() );
        System.out.println( car.startEngine() );

        Mitsubishi mitsubishi = new Mitsubishi(6, "outlander");
        System.out.println( mitsubishi.accelerate() );
        System.out.println( mitsubishi.accelerate() );
        System.out.println( mitsubishi.startEngine() );

        Ford ford = new Ford(4, "focus");
        System.out.println( ford.accelerate() );
        System.out.println( ford.accelerate() );
        System.out.println( ford.startEngine() );
    }



}
