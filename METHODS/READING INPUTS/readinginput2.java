import java.util.Scanner; // so this line here is used to import scanner class , which helps users to give input to the program manually.

public class readinginput2 {

    public static void main(String[] args) {

        int CY = 2025;

        try { // try and catch block is used to try a block of code and catch a exception in it.
            System.out.println(readinput(CY));
        } catch (Exception e) {
            System.out.println(readinputscanner(CY));
        }
    }

    public static String readinput(int CY) {

        String name = System.console().readLine("Hello there "); // the output of this console line will be displayed only in terminal you cannot run it by clicking the run button.
        System.out.println("Thanku " + name);

        String dateofbirth = System.console().readLine(" What year you were born ");
        int age = CY - Integer.parseInt(dateofbirth); // this line here is used to convert the string into integer by using wrapper class.

        return "So  your " + age + " years old";
    }

    public static String readinputscanner(int CY){

        Scanner scanner = new Scanner(System.in); // we have created a scanner class here to take the input.

        System.out.println("Hi , what is your name ? ");

        String name = scanner.nextLine();// this line will take the input on the nextline.

        System.out.println("Thanku " +name);


        System.out.println(" What year you were born");
        Boolean validDob = false;
        int age = 0;

        do {
            System.out.println("Enter the birth year which should be >="+(CY - 125)+" and <=" +(CY));

            try {
                age = checkdata(CY,scanner.nextLine());
                validDob = age < 0 ? false : true ;
            }catch (NumberFormatException badUserData){
                System.out.println("Character are not allowed , Please enter valid input ");
            }
        }while (!validDob);

        return "So  your " + age + " years old";
    }

    public static int checkdata(int CY , String dateofbirth ){

        int dob = Integer.parseInt(dateofbirth);
        int minimumYear = CY - 125;

        if ((dob > CY) || (dob < minimumYear)){
            return -1;
        }
        return (CY - dob);
    }



}
