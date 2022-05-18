// Programmer: Michael O'Reilly
// Date: 17/05/2022
// Problem 1 Test:

package problem1;

import java.lang.ref.Cleaner;

public class TestAccount {
    
    public static void main (String[] args) {
                
        Account accountA = new Account("A0123", "Account A", 1000);
        Account accountB = new Account("B0123", "Account B", 1000);

        System.out.println("Account A has balance = " + accountA.getBalance());
        System.out.println("Account B has balance = " + accountB.getBalance());
        System.out.println("============================");

        accountA.credit(1000);
        accountB.credit(2000);

        System.out.println("Credit $1000 in " + accountA.getName());
        System.out.println("Account A has balance = " + accountA.getBalance());

        System.out.println("Credit $2000 in " + accountB.getName());
        System.out.println("Account B has balance = " + accountB.getBalance());

        System.out.println("============================");

        System.out.println("Transfer $1000 from Account B to Account A");
        accountB.transferTo(accountA, 1000);
        System.out.println("Account A has balance = " + accountA.getBalance());
        System.out.println("Account B has balance = " + accountB.getBalance());
        System.out.println("============================");

        System.out.println("Debit $100 from Account A");
        accountA.debit(100);
        System.out.println("Account A has balance = " + accountA.getBalance());

        System.out.println("Debit $3000 from Account B");
        accountB.debit(3000);
        System.out.println("Account B has balance = " + accountB.getBalance());

    }
}
