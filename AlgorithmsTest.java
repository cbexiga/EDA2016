package pt.europeia.eda;

public class AlgorithmsTest {

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
	
	public static String returnArray(int[] arr){
		
		String strArray = "";
		
		for(int i = 0; i != arr.length; i++){
			strArray += arr[i] + " ";
		}
		
		
		return strArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] newArray = new int[]{14,33,27,10,35,19,42,44};
		
		System.out.println("Before algorithm: " + returnArray(newArray));
		
		sort(newArray);
		
		returnArray(newArray);
		
		System.out.println("After algorithm: " + returnArray(newArray));
		
	}

}
