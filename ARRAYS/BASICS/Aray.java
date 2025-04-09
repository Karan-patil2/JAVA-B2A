package dev.lpa;

public class Aray {
    public static void main(String[] args) {

        int[] Array = new int[10];
        Array[0] = 1;  // initializing Arrays manually
        Array[1] = 2;
        Array[2] = 3;

        System.out.println(Array[1]);

        int[] firstFive = {1,2,3,4,5};
        System.out.println("First element is " +firstFive[0]);

        int arraylength = firstFive.length;

        System.out.println("Lenght of firstFive array is " +arraylength);

        int[] newArray;

        newArray = new int[5];
        for (int i =0;i < newArray.length;i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
      //  System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;



    }
}
