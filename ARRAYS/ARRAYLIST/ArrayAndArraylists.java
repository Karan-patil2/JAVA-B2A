package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArraylists {
    public static void main(String[] args) {

        String[] OriginalArray = new String[]{"First","Second","Third"};
        var OriginalList = Arrays.asList(OriginalArray);

        OriginalList.set(0,"one");
        System.out.println("Lists :" +OriginalList);
        System.out.println("Arrays" +Arrays.toString(OriginalArray));

        OriginalList.sort(Comparator.naturalOrder());
        System.out.println("Arrays" +Arrays.toString(OriginalArray));

        List<String> newlist = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newlist);

    }
}
