public class method {


    public static void main(String[] args) {


        calculatescore(true,800,5,100);

       int K = Add(1,2);
       System.out.print("this is the addition " +K);



    }
//Method - Method is a block of code , which we can call repeatedly without any re-declaration.
//This below is a method created named calculatescore(parameters) , this are the parameters passed to the method which saves the time of redeclaring the variable.
    public static void calculatescore(boolean A , int score , int level , int bonus){//here the method is of void type so we don't need to return anything , but if we declare it of data type (which can be only primitive data type) then we need to return it.

        int finalscore = score ;

        finalscore += (bonus * level);//all this calculation is done once in the method and can be called  repeatedly
        finalscore += 1000;
        System.out.print(finalscore);
    }

    public static int Add(int A , int B ){//Here instead of void we have used int so now we have to return the value.
        int C = A + B;
        return C;

    }
}
