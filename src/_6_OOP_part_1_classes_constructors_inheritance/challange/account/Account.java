package _6_OOP_part_1_classes_constructors_inheritance.challange.account;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("2456", 4789797, "Default name", "Default address",
                "Default number");
        System.out.println("Empty contructor");
    }

    public Account(String accountNumber, double balance, String customerName,
                   String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Constructor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public static void main(String[] args) {
        Account johnAccount = new Account();
        System.out.println(johnAccount.getAccountNumber());
        System.out.println(johnAccount.getBalance());
        System.out.println("--------------------------------------------------------------------");
        Account bobAccount = new Account("123456789", 800.0, "Bob Kowalski",
                "bob@gmail.com", "112121212");
        System.out.println(bobAccount.getAccountNumber());
        System.out.println(bobAccount.getBalance());
        System.out.println(bobAccount.getAccountNumber());
        System.out.println(bobAccount.getCustomerEmailAddress());
        System.out.println(bobAccount.getCustomerName());
        System.out.println(bobAccount.getCustomerPhoneNumber());
    }

    public void deposit(long funds) {
        this.balance += funds;
    }

    public void withdrawal(long funds) {
        if (this.balance < funds) {  // this.balance - funds < 0
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            balance -= funds; // this.balance - funds < 0
            System.out.println("Withdrawal of " + funds + " processed. Remaining balance = " + balance);
        }
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

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

