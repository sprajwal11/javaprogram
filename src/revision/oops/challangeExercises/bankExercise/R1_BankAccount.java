package revision.oops.challangeExercises.bankExercise;

public class R1_BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public R1_BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber){
        System.out.println("Constructer with parameters called");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.customerPhoneNumber=customerPhoneNumber;

    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of ");
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount <= 0) {
            System.out.println(balance + " available. withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
