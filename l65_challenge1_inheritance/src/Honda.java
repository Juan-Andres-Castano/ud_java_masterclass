



public class Honda extends Car {

    private int roadService;


    public Honda(int roadService) {
//         public Honda(String name, String size, int wheels, int doors, boolean isManual, int currentGear, int roadService) {
        super("Honda", "4WD", 5, 5, false, 6);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getVelocity()  + rate ;
        if(newVelocity ==0){
            stop();
            setCurrentGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            setCurrentGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            setCurrentGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        }else{
            setCurrentGear(4);
        }


        if(newVelocity >0){
            changeVelocity(newVelocity, getCurrentDirection());
        }


    }
}
