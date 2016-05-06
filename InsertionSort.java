package pt.europeia.eda;

public class InsertionSort {

public static int[] sort(int[] arr){
		
		int valueToInsert, position;
		
		for(int i = 1; i != arr.length; i++){
			valueToInsert = arr[i];
			position = i;
			
			while(position > 0 && arr[position - 1] > valueToInsert){
				arr[position] = arr[position - 1];
				position--;
			}
			
			arr[position] = valueToInsert;
		}
		
		
		return arr;
	}
	
	
}
