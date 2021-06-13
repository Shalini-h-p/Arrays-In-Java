package shalini.com;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter count: ");
        int count = scan.nextInt();
        scan.nextLine();
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min= " + returnedMin);

    }


    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            scan.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}

