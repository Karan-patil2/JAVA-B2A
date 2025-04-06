//Create a new class for a bank account.
//Create fields for account characteristics like:
//account number.
//account balance.
//customer name.
//email.
//phone number.

//Create getters and setters for each field.
//Create two additional methods:
//one for depositing funds into the account.
//one for withdrawing funds from the account.

//A customer should not be allowed to withdraw funds if that withdrawal takes their balance negative.
//Create a new project called ClassesChallenge with the usual Main class with the usual main method.
//You'll create an instance of an Account class and then test your withdraw and deposit methods.
//You'll print information to the console that confirms what the balance is after the methods are called.

//You want to make this class encapsulated, so you'll make all your fields private and set up getter and setter methods for your fields.
//In addition, you'll have two behavioral methods. One for depositing funds, the other for withdrawing funds.
//In addition to this class, you'll set up a main class with a main method that creates at least one instance of the bank account class and simulates depositing and withdrawing money from the account.


public class challenge13 {
    public static void main(String[] args) {

        Account kacc = new Account();
        kacc.deposit(9000);
        kacc.withdrawal(1000);

    }
}
