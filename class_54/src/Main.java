


public class Main {
    public static void main(String[] args){

        Car prosche1  = new Car();
        Car prosche2  = new Car();

       // prosche1.model = "Carrera";

        prosche1.setModel("carrera");
        System.out.println( "model is " + prosche1.getModel());

        Account bobsAccount = new Account();
     /*   bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("bob");*/
        //.....

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerEmail());

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account juanAccount = new Account("1243456",0.00,"juan andres","juan@npetronic.com","3423424");
        System.out.println(juanAccount.getAccountNumber());
        System.out.println(juanAccount.getBalance());
        System.out.println(juanAccount.getCustomerEmail());


        Account timsAcccount = new Account("Tim", "email","1333");
        System.out.println(timsAcccount.getAccountNumber() + " name is " + timsAcccount.getCustomerName());


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());


        VipPerson person2 = new VipPerson("bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person22 = new VipPerson("tim", 19000.00, "tim@yahoo.com");
        System.out.println(person22.getName());
        System.out.println(person22.getEmail());

    }


}


