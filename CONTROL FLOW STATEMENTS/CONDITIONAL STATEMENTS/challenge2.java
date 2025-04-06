//1.create 2 variables of double type and assign them the value of 20.00 and 80.00 and add them  together and multiply the output to 100.00.
//2.use remainder operator % and the answer of step 1 % 40.00.
//3.create a boolean operator to assign value true if the value is 0.00 orelse false,and display it.
//4.write a if then statement to display "got some remainder "  if in step 3 it is not true.


public class challenge2 {
    public static void main(String[] args) {
        double A = 20.00;
        double B = 80.00;
        double C = (A+B)*100.00;
        System.out.print("Total value is " +C);
        double D = C % 40.00;
        System.out.print("The Remainder is " +D);
        Boolean E = (D == 0) ? true : false;
        System.out.print("E = "+E);
        if(E = false){//or can use (!E)
            System.out.print("Got some remainder ");
        }


    }
}
