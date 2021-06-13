import java.util.Scanner;

public class ArraysInJava {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(" Enter " + i + " ,typed i values " + myIntegers[i]);
        }
        System.out.println("the average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println(" Enter " + number + " integers values.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
