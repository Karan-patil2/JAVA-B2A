public class Stringformatting {
    public static void main(String[] args) {

        String A = "Print bullet point\n" + "\t\u2022first point\n" + "\t\t\u2022second point";
        System.out.println(A);

        int age = 21;
        System.out.printf("your Age is %d\n", age);
        System.out.println("the index of letter p = " +A.indexOf("P"));
        System.out.println(A.length());
        

    }
}
