public class forloop {
    public static void main(String[] args) {
        for(int counter = 1;counter  <= 5; counter++){// This is basic for loop Synatx (initialization ; condition ;increment or decrement operator)
            System.out.println(counter);
        }

        for (double i = 7.5;i <= 10 ; i += 0.25){//basically this for loop is for increasing the interest but with o.25% each time.
            double interestAmount = interest(100.0,i);
            System.out.println("$100 at rate " + i +" interest = $" +interestAmount );
        }

    }

    public static double interest(double amount , double interest){

        return (amount * (interest/100) );
    }
}
