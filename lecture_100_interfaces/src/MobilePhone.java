public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone power up" );
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){

        System.out.println("ring " + phoneNumber + "on mobile phone" );
        }else{
            System.out.println("phone is off" );
        }

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("asnwering the mobile phone" );
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn == true){
            isRinging = true;
            System.out.println("melody playing ring");
        }else{
            isRinging = false;
            System.out.println("mobile phone not on or number different" );
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
