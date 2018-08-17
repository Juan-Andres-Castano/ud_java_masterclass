public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    public int entry;

    public Account(){
        this("5678",2.50,"default name", "default email", "default phone");
        System.out.println("empty constructor");
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("999",100.5,customerName,customerEmail,customerPhone);
       // this.customerName = customerName;
      //  this.customerEmail = customerEmail;
      //  this.customerPhone = customerPhone;
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters");
       /// setAccountNumber(number); no settters in constructors
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmailAddress;
        this.customerPhone = customerPhoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount + "made. New balance " + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <=0){
            System.out.println("only"+ this.balance + " available. Withdrawal nor processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of"+ withdrawalAmount + " processed. Remaining balanace =" + this.balance);
        }
    }
}
