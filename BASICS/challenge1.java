//#challenge 1 
// assign 3 variable with 3 data types and at the end multiply them with long 
public class challenge1{
    public static void main(String[] args) {
        int A = 10000;

        byte B = 12;

        short C = 20000;

        long D = 200000000000000L * (A+B+C);//here this number exceeds integer range so that's why we have have to tell the complier that it is a long number by giving L after the number.

        System.out.println(D);


//chalenge 2 :-

//convert pounds to kilograms.

        double P = 200d;

        double K = 200d * 0.453592;

        System.out.println("THE CONVERSION OF POUNDS TO KILO IS = "+K);

        
        
//challenge 3 :- 
//print "?" using unicode :- is a number or code used to represent different characters differently.

        char N = '?';
        char m = '\u003F';
        System.out.println("the value is "+N +m);
    }
}  

//output :-
//6002400000000000000
//THE CONVERSION OF POUNDS TO KILO IS = 90.7184.
//the value is ??.