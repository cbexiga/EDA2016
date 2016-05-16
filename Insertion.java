package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Insertion {
	
	public Integer[] clean(final Integer[] value){
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(value));
		list.removeAll(Collections.singleton(null));
		return list.toArray(new Integer[list.size()]);
	}
	
	
	public void sort(Integer[] integer){
		
		int valueToInsert, position;
		
		for(int i = 0; i != integer.length; i++){
			valueToInsert = integer[i];
			position = i;
			
			
			while(position > 0 && integer[position -1] > valueToInsert){
				integer[position] = integer[position -1];
				position -= 1;
			}
			
			integer[position] = valueToInsert;
		}
		
		System.out.println(integer);
	}
  
	public static void main(String[] args) {
		
		Insertion insertion = new Insertion();
		Integer[] kints1Insertion = new Integer[1000];
		int i = 0;
		Scanner scanner;
	
		try{
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
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
