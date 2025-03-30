//Primitive data types - int , float , double , decimal , boolean , char. 
//Wrapper class - basically these are the primitive data class but in full form (ex. int is a primitive data type and it's wrapper class is Integer that's the difference). 

public class primitive{
    public static void main(String[] args){
        int A = Integer.MAX_VALUE;
        int B = Integer.MIN_VALUE;

        System.out.println("INTEGER RANGE IS = "+Integer.MAX_VALUE+" to "+Integer.MIN_VALUE);

        short D = Short.MIN_VALUE;
        System.out.println(D); 

        short E = (Short.MIN_VALUE/2);//while using Jshell you need to specify (short) before the experssion (Short.MIN_VALUE/2) because the compiler by default uses the int data type.
        System.out.println(E);//and here casting is used.

        float F = 5.24F;//This shows a error as we don't specify the F here to tell the complier the it's float data type , because it by deafult assumes the double.Double is the defualt data type for decimal numbers.
        System.out.println(F);

        char K = 'h';//Is used to store single character 
        System.out.println(K);

        boolean M = true;//used to store only 2 values true , false , yes , no or 1 , 0.
        System.out.println(M);
        }
}

//this code is basic code through which we understand the primitive data types and their range using variable

// Casting - Means converting one data type(eg.int , short ) to another data type. format is (cast) in the parenthesis the data type is used for casting.

//The complier by default assign the data type int if not specified. So while using or assigning a number greater than the integer range you need the specify the data type as explain on line 18(not only for Jshell but for all).

//Output
//INTEGER RANGE IS = 2147483647 to -2147483648
//-32768
//-16384
//5.24
//h
//true.

 
