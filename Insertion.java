package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
	
	 
	public static <Item extends Comparable<? super Item>> void sort(
            final Item[] values) {
        for (int numberOfSortedItems = 1;
             numberOfSortedItems < values.length;
             numberOfSortedItems++)
            for (int i = numberOfSortedItems; i != 0
                    && isLess(values[i], values[i - 1]); i--)
                swap(values, i - 1, i);

        assert isIncreasing(values) :
            "Array should be increasing after sorting.";
    }

    private static <Value extends Comparable<? super Value>> boolean isLess(
            final Value first, final Value second) {
        return first.compareTo(second) < 0;
    }

    private static void swap(final Object[] values, final int firstPosition,
            final int secondPosition) {
        final Object temporary = values[firstPosition];
        values[firstPosition] = values[secondPosition];
        values[secondPosition] = temporary;
    }

    private static <Item extends Comparable<? super Item>> boolean isIncreasing(
            final Item[] values) {
        for (int i = 1; i < values.length; i++)
            if (isLess(values[i], values[i - 1]))
                return false;
        return true;
    }
	
    
    public static void main(String[] args) {
    	Insertion insertion = new Insertion();
		Integer[] kints1Insertion = new Integer[4000];
		int i = 0;
		Scanner scanner;
		
		try{
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\4Kints.txt"));
			while(scanner.hasNext()){
				kints1Insertion[i++] = scanner.nextInt();
				}
			System.out.println("Before insertion sort: " + Arrays.toString(kints1Insertion));
			Stopwatch timerInsertion = new Stopwatch();
			insertion.sort(kints1Insertion);
			
			System.out.println("Time: " + timerInsertion.elapsedTime() + "\nAfter insertion sort: " + Arrays.toString(kints1Insertion) + "\n");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
    
}
