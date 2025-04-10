package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArrayOp {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray =  new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdarray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdarray));

        int[] fourth = Arrays.copyOf(thirdarray , thirdarray.length);
        System.out.println(Arrays.toString(fourth));

        Arrays.sort(fourth);
        System.out.println(Arrays.toString(thirdarray));
        System.out.println(Arrays.toString(fourth));

        int[] smallarray = Arrays.copyOf(thirdarray,5);
        System.out.println(Arrays.toString(smallarray));

        int[] bigarray = Arrays.copyOf(thirdarray,15);
        System.out.println(Arrays.toString(thirdarray));

    }

    private static int[] getRandomArray(int len){

        Random R = new Random();
        int[] newint = new int[len];

        for (int i =0;i<len;i++) {
            newint[i] = R.nextInt(100);
        }
        return newint;
        }
    }

