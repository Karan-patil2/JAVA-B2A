public class Challenge14constructor { // use Customer file
    public static void main(String[] args) {


        Customer customer = new Customer("karan",1000.0,"karanpatil@mail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditlimit());
        System.out.println(customer.getEmail());

        Customer secondcustomer = new Customer();
        System.out.println(secondcustomer.getName());
        System.out.println(secondcustomer.getCreditlimit());
        System.out.println(secondcustomer.getEmail());

        Customer thirdcustomer = new Customer("Joe","yeah@mail");
        System.out.println(thirdcustomer.getName());
        System.out.println(thirdcustomer.getCreditlimit());
        System.out.println(thirdcustomer.getEmail());

    }
}
