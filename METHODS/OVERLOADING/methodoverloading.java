//Method overloading = It  basically means we can use a method with same name , but with different parameters

public class methodoverloading {
    public static void main(String[] args) {
        int  a =A(2);
        System.out.println("This is the output of the first method " +a);
        int R = A(2,3);
        System.out.println("This is output of the second method " + R);
    }

    public static int A(int K){//this is method 1 with one paramter.
        return K*10;
    }
    public static int A(int K,int B){// this is method with the previous parameter and a new one.
        System.out.println(" This is the second output " + K + "  " +B);
        return K*10*B;
    }
}

// Output :
//This is the output of the first method 20
// This is the second output 2  3
//This is output of the second method 60.
