package pt.europeia.eda;

import java.lang.reflect.Array;

public class Merge {

	 public static <Item extends Comparable<? super Item>> void sort(
	            final Item[] values) {
	        @SuppressWarnings("unchecked")
	        final Item[] auxiliary = (Item[]) Array.newInstance(
	                values.getClass().getComponentType(), values.length);

	        sort(values, auxiliary, 0, values.length - 1);

	        assert isIncreasing(
	                values) : "Array should be increasing after sorting.";
	    }

	    private static <Item extends Comparable<? super Item>> void sort(
	            final Item[] values, final Item[] auxiliary, final int first,
	            final int last) {
	        if (last <= first)
	            return;

	        final int middle = first + (last - first) / 2;

	        sort(values, auxiliary, first, middle);
	        sort(values, auxiliary, middle + 1, last);

	        merge(values, auxiliary, first, middle, last);
	    }

	    private static <Item extends Comparable<? super Item>> void merge(
	            final Item[] values, final Item[] auxiliary, final int first,
	            final int middle, final int last) {
	        assert isIncreasing(values, first,
	                middle) : "Can only merge increasing segments.";
	        assert isIncreasing(values, middle + 1,
	                last) : "Can only merge increasing segments.";

	        for (int i = first; i <= last; i++)
	            auxiliary[i] = values[i];

	        int i = first;
	        int j = middle + 1;

	        for (int k = first; k <= last; k++)
	            if (i > middle) {
	                values[k] = auxiliary[j];
	                j++;
	            } else if (j > last) {
	                values[k] = auxiliary[i];
	                i++;
	            } else if (isLess(auxiliary[j], auxiliary[i])) {
	                values[k] = auxiliary[j];
	                j++;
	            } else {
	                values[k] = auxiliary[i];
	                i++;
	            }

	        assert isIncreasing(values, first,
	                last) : "Merged segment should be increasing.";
	    }

	    private static <Value extends Comparable<? super Value>> boolean isLess(
	            final Value first, final Value second) {
	        return first.compareTo(second) < 0;
	    }

	    private static <Item extends Comparable<? super Item>> boolean isIncreasing(
	            final Item[] values) {
	        return isIncreasing(values, 0, values.length - 1);
	    }

	    private static <Item extends Comparable<? super Item>> boolean isIncreasing(
	            final Item[] values, final int first, final int last) {
	        for (int i = first + 1; i <= last; i++)
	            if (isLess(values[i], values[i - 1]))
	                return false;

	        return true;
	    }
	
	
}
