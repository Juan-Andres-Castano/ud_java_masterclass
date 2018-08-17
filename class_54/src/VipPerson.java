


public class VipPerson {


    private String name;
    private double creditLimit;
    private String email;


    public VipPerson(){
        this("Default name", 5000.0, "default@gmail.com");

    }

    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"unknow");

      //  this.name = name;
      //  this.creditLimit = creditLimit;
    }

    public VipPerson(double creditLimit, String email) {
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
