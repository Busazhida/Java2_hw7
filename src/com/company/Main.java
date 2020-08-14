package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();

        Comparator<String> comparator = (o1, o2) -> {
            Integer int1 = o1.length();
            Integer int2 = o2.length();
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            }
            return int1.compareTo(int2);
        };
        addToCollection(A, 5);
        printOut(A);
        Iterator<String> iteratorA = A.iterator();
        System.out.println("__________________");


        addToCollection1(B, 5);
        printOut(B);
        Iterator<String> iteratorB = B.iterator();
        System.out.println("__________________");
        Collections.reverse(B);

        System.out.println("New list C:");

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            C.add(iteratorA.next());
            C.add(iteratorB.next());
        }
        C.sort(comparator);
        printOut(C);
        System.out.println("__________________");
        System.out.println("The list is sorted:");
        C.sort(comparator);
        printOut(C);
    }

    public static void addToCollection(Collection<String> collection, int quantity) {
        System.out.println("Please enter 5 names");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            collection.add(s.nextLine());
        }
        System.out.println("List A is full!");
        System.out.println("__________________");

    }

    public static void addToCollection1(Collection<String> collection, int quantity) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter another 5 names");
        for (int i = 0; i < quantity; i++) {
            collection.add(s.nextLine());
        }
        System.out.println("List B is full!");
        System.out.println("__________________");

    }

    public static void printOut(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

