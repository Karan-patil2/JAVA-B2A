//Step 1 is to create a method called isEvenNumber that takes a parameter of type int.
//Its purpose is to determine if the argument passed to the method is an even number or not.
//Return true from the method if it's an even number; otherwise, return false.
//Next, use a while loop to test a range of numbers from 5 up to and including 20, but printing out only the even numbers determined by the call to the isEvenNumber method

//So, Step 2 is to modify the while code.
//Make it also record the total number of even numbers it has found.
//Break out of the loop once 5 even numbers are found.
//Finally, display the total number of odd and even numbers found.

public class whileloopchal {
    public static void main(String[] args) {
        int number = 1;
        int odd = 0;
        int even = 0;

        while (number <= 20){
            number++;
            if (!A(number)){
                odd++;
                continue;
            }
            System.out.println("Even no " +number);
            even++;
            if (even >= 5){
                break;
            }
        }
    }

    public static boolean A(int No) {

        if (No % 2 ==0){
            return true;
        }else {
            return false;
        }

    }
}
