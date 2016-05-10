package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FixedArray<Item> {
	
	
	private Item[] items;
	private int size;
	
	@SuppressWarnings("unchecked")
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
	
	
	public static void main(String[] args) {
		
		FixedArray<Integer> fixed = new FixedArray<Integer>(100000);
		int numberOfExperiments = 5;
		Scanner scanner;
		while(numberOfExperiments != 0){
			try {
				scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
				Stopwatch watch = new Stopwatch();
				
				while(scanner.hasNext()){
					fixed.push(scanner.nextInt());
				}
				
				System.out.println("Demorou a inserir no fixed array: " + watch.elapsedTime());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(fixed.sizeOfItems());
			
			Stopwatch watch = new Stopwatch();
			while(fixed.sizeOfItems() != 0){
				fixed.pop();
			}
			System.out.println("Demorou a retirar no fixed array: " + watch.elapsedTime());
			System.out.println("------------------------------");
			System.gc();
			numberOfExperiments--;
		}
	
	}
}
