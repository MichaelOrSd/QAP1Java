// Programer: Michael O'Reilly
// Date: 16/05/2022
// Problem 1 Class:

package problem1;

public class Account {
    
    String id;
    String name;
    int balance = 0;

    public Account (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getBalance () {
        return balance;
    }

    public int credit (int amount) {
        balance += amount;
        return balance;
    }

    public int debit (int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Ammount exceeded balance");
        }
        return balance;
    }

    public int transferTo (Account anotherAccount, int amount) {
        if (amount <= balance) {
            balance -= amount;
            anotherAccount.credit(amount);
        } else {
            System.out.println("Ammount exceeded balance");
        }
        return balance;
    }

    public String toString () {
        return "Account " + id + ": " + name + ": " + balance + "\n";
    }
}

