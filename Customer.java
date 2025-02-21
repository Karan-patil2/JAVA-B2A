public class Customer {

    private String name;
    private double creditlimit;
    private String email;

    public Customer() {// This constructor is created at last , and this constructor is bascially used to chain the other constructor.
        this("karan Patil","karan@gmail.com");
    }

    public Customer(String name , String email) {// this is the second constructor which is given the credit limit and no name .
        this(name,1000.0,email);// this is used to basically give values to other constructor in this constructor , and it should be stated in the first line of the constructor.

    }

    public Customer(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
