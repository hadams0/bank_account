import java.time.LocalDate;

public class BankAccount {

   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private int accountNumber;
   private double balance;

//    Constructor
    public BankAccount(String inputName, String inputLastname, String inputDateOfBirth, int inputAccountNumber, double inputBalance){
        this.firstName = inputName;
        this.lastName = inputLastname;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
    }

//    Methods

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdrawal(double amount){
        this.balance -= amount;
    }

    public void payInterest(double interestRate){
        double interest = this.balance * interestRate;
        this.balance += interest;
    }

//    Getters and Setters

   public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }


}
