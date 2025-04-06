public class whiledo {
    public static void main(String[] args) {
        int J = 0;
        while (J < 5){//WHILE LOOP : in this the block of code which should be or will be executed atleast once necessarly.
            J++;
            System.out.println("The no is " +5);

        }

        int I = 0;
        boolean ready = true;
        do {// The do-while loop is will execute the do (Block of code) and then while(Statement).
            if(I < 5){
                I++;
                System.out.println("The number is " +I);
            }
        }while(ready);
    }
}
