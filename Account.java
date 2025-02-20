public class Account {

    private String accno;
    private double accbal;
    private String cusname;
    private String email;
    private String no;

    public void deposit(double depositamount){
        accbal += depositamount;
        System.out.println("deposited amount $"+depositamount+ " ,New balance is $" +accbal);
    }

    public void withdrawal(double withamount){
        if (accbal < withamount){
            System.out.println("insufficient balance !! your balance is "+accbal);
        }else {
            accbal -= withamount;
            System.out.println("You have sucessfully withdraw the amount of " +withamount+ " ,Your new balance is "+accbal);
        }
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getAccbal() {
        return accbal;
    }

    public void setAccbal(double accbal) {
        this.accbal = accbal;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
