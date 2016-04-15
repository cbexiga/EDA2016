package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FixedArray<Item> {
	
	
	private Item[] items;
	private int size;
	
	public FixedArray(int max){
		items = (Item[])new Object[max];
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int sizeOfItems(){
		return size;
	}

	public void push(Item item){
		items[size++] = item;
	}
	
	public Item pop(){
		return items[--size];
	}
	
	
	/*public static void main(String[] args){
		
		FixedArray<Integer> s = new FixedArray<Integer>(10000);
		
		Scanner scanner;
		try {
			Stopwatch watch = new Stopwatch();
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\32Kints.txt"));
			while(scanner.hasNext()){
				s.push(scanner.nextInt());
				//System.out.println(s.pop());
			}
			System.out.println("---------------------------------------------------------\n" + watch.elapsedTime());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}*/
	
	
}
