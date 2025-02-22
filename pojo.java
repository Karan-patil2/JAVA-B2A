public class pojo {
    public static void main(String[] args) {

        for (int i = 1;i<=5;i++) {
            Student s = new Student("23200" +i,
                    switch (i){
                    case 1 -> "karan";
                    case 2 -> "karry";
                    case 3 -> "nandu";
                    case 4 -> "goro";
                    case 5 -> "sum";
                    default -> "nothing";

                    },"27.03.04","Javaclass");
                System.out.println(s);

        }
    }
}
