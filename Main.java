import java.lang.System;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        InsertionSort insertionSorter = new InsertionSort();
        LinearSearch linearSearcher = new LinearSearch();
        BinarySearch binarySearcher = new BinarySearch();

        int[] ten = dataGenerator.generateDataSet(10);
        int[] hundred = dataGenerator.generateDataSet(100);
        int[] thousand = dataGenerator.generateDataSet(1000);
        int[] tenThousand = dataGenerator.generateDataSet(10000);
        int[] hundredThousand = dataGenerator.generateDataSet(100000);



//testing insertion sort
        int[] testData = dataGenerator.generateDataSet(100000);

        System.out.print("First 20 items (unsorted):");
        for (int i = 0; i < 20; i++){
            System.out.print(" " + testData[i]);
        }
        System.out.println();

        System.out.println("Last 20 items (unsorted):");
        for (int i = 99980; i < 100000; i++){
            System.out.print(" " + testData[i]);
        }
        System.out.println();

        int[] insertionResult = insertionSorter.sort(testData);
        System.out.println("First 20 items (sorted):");
        for (int i = 0; i < 20; i++){
            System.out.print(" " + insertionResult[i]);
        }
        System.out.println();

        System.out.println("Last 20 items (sorted):");
        for (int i = 99980; i < 100000; i++){
            System.out.print(" " + insertionResult[i]);
        }
        System.out.println();



//complexity analysis for sorting
        System.out.println("Complexity analysis for insertion sort");

        long start = System.nanoTime();
        insertionSorter.sort(ten);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("data size: 10   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        insertionSorter.sort(hundred);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        insertionSorter.sort(thousand);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 1,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        insertionSorter.sort(tenThousand);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        insertionSorter.sort(hundredThousand);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100,000   time elapsed: " + timeElapsed + " nanoseconds");

        System.out.println("Complexity analysis for built in sort");
        int[] temp = ten;

        start = System.nanoTime();
        Arrays.sort(temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = hundred;
        Arrays.sort(temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = thousand;
        Arrays.sort(temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 1,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = tenThousand;
        Arrays.sort(temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = hundredThousand;
        Arrays.sort(temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100,000   time elapsed: " + timeElapsed + " nanoseconds");





//complexity analysis for searching
        System.out.println("Complexity analysis for linear search");

        temp = ten;

        start = System.nanoTime();
        linearSearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = hundred;
        linearSearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = thousand;
        linearSearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 1,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = tenThousand;
        linearSearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = hundredThousand;
        linearSearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100,000   time elapsed: " + timeElapsed + " nanoseconds");

        System.out.println("Complexity analysis for built in sort + binary search");

        start = System.nanoTime();
        temp = ten;
        binarySearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = hundred;
        binarySearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = thousand;
        binarySearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 1,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = tenThousand;
        binarySearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 10,000   time elapsed: " + timeElapsed + " nanoseconds");

        start = System.nanoTime();
        temp = hundredThousand;
        binarySearcher.search(-1, temp);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("data size: 100,000   time elapsed: " + timeElapsed + " nanoseconds");


    }
}
