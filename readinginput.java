public class readinginput {

    public static void main(String[] args) {

        int CY = 2025;

        System.out.println(readinput(CY));
    }

    public static String readinput(int CY){

        String name = System.console().readLine("Hello there ");
        System.out.println("Thanku "+name);

        String dateofbirth = System.console().readLine(" What year you were born ");
        int age = CY - Integer.parseInt(dateofbirth);

        return "So  your " +age+ " years old";
    }
}
