//Switch cases - they are use instead of if else statement , they work similar to if else statement.


public class switchecase {
    public static void main(String[] args) {

        int value = 2;
        switch (value) {// here we want to check the values , so we are using switch case.
            case 1 : // we can either use single case in a line
                System.out.println("The value is 1 ");
                break;

            case 2 :
                System.out.println("The value is 2 ");
                break;

            case 3 : case 4 : case 5 : //  Or we can use multiple cases in a line.
                System.out.println("The value is 3 or 4 or 5 ");
                System.out.println("Actual value is " +value);
                break;

            default:
                System.out.println(" The value is greater than 5 " );
                break;
        }
    }
}
