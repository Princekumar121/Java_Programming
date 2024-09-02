/*
Write the program for banking system
    bank keeps track of the balance of a bank using instance variable account,name,account number.
    make three setter method to input values of name,account number,balance
    make deposit method to add money to the balance
    make withdraw method to withdraw money from the balance
    make the third method for check balance
    make the fourth method for display the name,account number,balance
*/

    import java.util.Scanner;
    class bank{
        double accountBalance;
        String name;
        String accountnumber;
    public void setname(String name){
        this.name = name;
    }
    void setaccountnumber(String accountnumber){
        this.accountnumber = accountnumber;
    }
    void setbalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    void deposit(double amount){
        accountBalance = accountBalance + amount;
    }
    void withdraw(double amount){
        if(amount > accountBalance){
            System.out.println("Insufficient balance");
        }
        else{
            accountBalance = accountBalance - amount;
        }
       
    }
    void checkbalance(){
        System.out.println("Your balance is: "+accountBalance);
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accountnumber);
        System.out.println("Balance: "+accountBalance);
    }
    public static void main(String[] args) {
        String name;
        String accountnumber;
        double accountBalance;
        bank b1 = new bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome to the bank----");
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your account number: ");
        accountnumber = sc.nextLine();
        System.out.println("Enter your balance: ");
        accountBalance = sc.nextDouble();
        System.out.println("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        System.out.println("Enter the amount you want to withdraw: ");
        double amount1 = sc.nextDouble();
        b1.setname(name);
        b1.setaccountnumber(accountnumber);
        b1.setbalance(accountBalance);
        b1.deposit(amount);
        b1.withdraw( amount1);
        b1.checkbalance();
        b1.display();
    }
}
    



