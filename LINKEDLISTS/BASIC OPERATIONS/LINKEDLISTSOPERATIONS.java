package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class LINKEDLISTSOPERATIONS {
    public static void main(String[] args) {


        //LinkedList<String> list = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0,"Canberra");
        System.out.println(placeToVisit);

        AddmoreElements(placeToVisit);
        System.out.println(placeToVisit);

       // RemoveElements(placeToVisit);
        //System.out.println(placeToVisit);

        //        gettingElements(placeToVisit);

//        printItinerary3(placeToVisit);

        TestIterators(placeToVisit);




    }

    private static void AddmoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue Methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack Methods
        list.push("Alice Springs");

    }

    private static void RemoveElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);

        String s1 = list.remove();  //remove the elements
        System.out.println(s1 + " is removed");

        String s2 = list.removeFirst(); //remove the First elements
        System.out.println(s2 + " is removed");

        String s3 = list.removeLast(); //remove the  Last elements
        System.out.println(s3 + " is removed");


        //Queue/deque poll Methods

        String p1 = list.poll();  //remove the elements
        System.out.println(p1 + " is removed");

        String p2 = list.pollFirst();  //remove the First elements
        System.out.println(p2 + " is removed");

        String p3 = list.pollLast();  //remove the Last elements
        System.out.println(p3 + " is removed");


        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 +" is removed");



    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("Retrived Element" +list.get(4));

        System.out.println("First Element" +list.getFirst());
        System.out.println("Last Element " +list.getLast());

        System.out.println("Darwin is at Position "+list.indexOf("Darwin"));
        System.out.println("Melbourne is at Position " +list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void TestIterators(LinkedList<String> list){
        var iterator = list.listIterator();
        //            System.out.println(iterator.next());
        while (iterator.hasNext()) {
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator.previous());

    }

}
