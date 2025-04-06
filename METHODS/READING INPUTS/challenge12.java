//You'll be using an endless loop which:
//Prompts the user to enter a number or any character to quit.
//Validates if the user-entered data really is a number. You can choose either an integer or double validation method.
//If the user-entered data is not a number, quit the loop.
//Keep track of the minimum number entered.
//Keep track of the maximum number entered.
//If the user has previously entered a set of numbers (or even just one), display the minimum and maximum number that the user entered.


import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int loopcount = 0;

        while (true){
            System.out.println("Enter the number or Enter any Character to exit");
            String nextinput = scanner.nextLine();

            try {
              int validnum = Integer.parseInt(nextinput);
              if (loopcount == 0 || validnum < min){
                    min = validnum;
              }
              if (loopcount == 0 || validnum > max){
                  max = validnum;
              }
              loopcount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }

        if(loopcount > 0){
            System.out.println("min = "+ min + " max = "+max);
        }else{
            System.out.println("Invaild data ");
        }
    }
}
