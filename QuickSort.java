package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {


    public static <Item extends Comparable<? super Item>> void sort(
            final Item[] values) {
        //StdRandom.shuffle(values);

        sort(values, 0, values.length - 1);

        assert isIncreasing(
                values) : "Array should be increasing after sorting.";
    }

    private static <Item extends Comparable<? super Item>> void sort(
            final Item[] values, final int first, final int last) {
        if (last <= first)
            return;

        final int j = partition(values, first, last);
        sort(values, first, j - 1);
        sort(values, j + 1, last);

        assert isIncreasing(values, first,
                last) : "Array segment should be increasing after sorting.";
    }

    private static <Item extends Comparable<? super Item>> int partition(
            final Item[] values, final int first, final int last) {
        int i = first;
        int j = last + 1;

        final Item pivot = values[first];

        while (true) {

            do
                ++i;
            while (isLess(values[i], pivot) && i != last);

            do
                --j;
            while (isLess(pivot, values[j]) && j != first);

            if (i >= j)
                break;

            swap(values, i, j);
        }

        swap(values, first, j);

        return j;
    }

    public static <Item extends Comparable<? super Item>> Item select(
            final Item[] values, final int k) {
        if (k < 0 || values.length <= k)
            throw new IndexOutOfBoundsException(
                    "Selected element out of bounds");

        //StdRandom.shuffle(values);

        int first = 0;
        int last = values.length - 1;

        while (last > first) {
            final int j = partition(values, first, last);
            if (j > k)
                last = j - 1;
            else if (j < k)
                first = j + 1;
            else
                return values[j];
        }

        return values[first];
    }

    private static <Value extends Comparable<? super Value>> boolean isLess(
            final Value first, final Value second) {
        return first.compareTo(second) < 0;
    }

    private static void swap(final Object[] values, final int i, final int j) {
        final Object temporary = values[i];
        values[i] = values[j];
        values[j] = temporary;
    }

    private static <Item extends Comparable<? super Item>> boolean isIncreasing(
            final Item[] values) {
        return isIncreasing(values, 0, values.length - 1);
    }

    private static <Item extends Comparable<? super Item>> boolean isIncreasing(
            final Item[] a, final int first, final int last) {
        for (int i = first + 1; i <= last; i++)
            if (isLess(a[i], a[i - 1]))
                return false;
        return true;
    }

    public static void main(String[] args) {
		
    	QuickSort quick = new QuickSort();
		Integer[] kints1Quick = new Integer[1000];
		int x = 0;
		Scanner scanner;
		
		try{
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
			while(scanner.hasNext()){
				kints1Quick[x++] = scanner.nextInt();
			}
			System.out.println("Before quick sort: " + Arrays.toString(kints1Quick));
			Stopwatch timerQuick = new Stopwatch();
			quick.sort(kints1Quick);
			System.out.println("Time: " + timerQuick.elapsedTime() + "\nAfter quick sort: " + Arrays.toString(kints1Quick) + "\n");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
    	
    	
    	
	}
}
