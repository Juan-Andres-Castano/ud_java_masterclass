public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("no acyion, desk phone no power button" );
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("ring " + phoneNumber + "on desk phone" );
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("asnwering the desk phone" );
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("ring ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
