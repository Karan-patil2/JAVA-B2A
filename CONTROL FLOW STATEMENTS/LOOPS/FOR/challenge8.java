//Create a prime number counter variable, that will keep count of how many prime numbers were found.
//Create a for statement, using any range of numbers, where the maximum number is <= 1000.
//For each number in the range:
//Check to see if it's a prime number using the isPrime method.
//If the number is prime, print it out and increment the prime number counter variable.
//Once the prime number counter equals three, exit the loop (Hint, use the break statement to exit).


public class challenge8 {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1;count < 3 && i <= 20; i++){
            if (IsPrime(i)){
            System.out.println(i);
            count++;
        }
    }
    }

    public static boolean IsPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
