//Variable - it is basically used to store information in computer , it can be character , string etc. As the name suggest the value or information of variable can vary.
//Variable has a data type assign to it like int , float , double etc. 
//NOTE - In Jshell we can assign or declare multiple values to the  a variable , but in other editor like vs that is not possible to re-declare a variable because its value is already store in the computer memory.
// let's write a code to understand it .

public class Variable{
    public static void main(String[] args) {
        int A = 4; // now if you try to assign a different value to A it will throw a error.
        System.out.println(A);// To display the value store in variable you just need to print it using System.out.println without the double quotes , they are used to print any statement or string  

        int B = 10 + 2;
        System.out.println(B);   

        int C = A + B;// This is called a expression ( using variables )
        System.out.println(C);// you can perform any mathematical operation or can print statements using variables.
    }
}

// Comman mistake i make is to save to the code and directly run it , it will also show error , so don't forget to save your code by Ctrl + S.
