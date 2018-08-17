public class Main {


    public static void main(String[] args)
    {
        ITelephone timsPhone  ;//this interface allow definir timsphone as desk or mobile phone.
        timsPhone  = new DeskPhone(34544);

        timsPhone.powerOn();
        timsPhone.callPhone(34544);
        timsPhone.answer();

        timsPhone = new MobilePhone(2434);
timsPhone.powerOn();
        timsPhone.callPhone(2434);
        timsPhone.answer();



    }

}
