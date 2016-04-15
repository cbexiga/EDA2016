package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ResizeArray<Item> implements Iterable<Item> {

	
	@SuppressWarnings("unchecked")
	private Item[] item = (Item[]) new Object[1];
	private int numberOfItems = 0;
	
	public boolean isEmpty(){
		return numberOfItems == 0;
	}
	
	public int size(){
		return numberOfItems;
	}
	
	private void resize(int max){
		//System.out.println("valor " + max);
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[]) new Object[max];
		
		for(int i = 0; i != numberOfItems; i++){
			temp[i] = item[i];
			item = temp;
		}
		//System.out.println("Aumentado: " + max);
	}
	
	public void push(Item itm){
		if(numberOfItems == item.length){
			resize(2 * item.length);
		}
		item[numberOfItems++] = itm;
	}
	
	public Item pop(){
		Item tempItem = item[--numberOfItems];
		item[numberOfItems] = null;
		if(numberOfItems > 0 && numberOfItems == item.length / 4){
			resize(item.length / 2);
		}
		return tempItem;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item>{

		private int i = numberOfItems;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return item[--i];
		}
		
		public void remove(){
			
		}
	}
	
	public static void main(String[] args){
		
		ResizeArray<Integer> s = new ResizeArray<>();
		int numberOfExperiments = 50;
		Scanner scanner;
		
		//for(int i = 0; i != numberOfExperiments; i++){
			try{
				scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\32Kints.txt"));
				
				Stopwatch watch = new Stopwatch();
				//System.out.println(System.nanoTime());
				while(scanner.hasNext()){
					s.push(scanner.nextInt());
				}
				System.out.println("-------------------------------------------------\nTempo: " + watch.elapsedTime());
				//System.out.println(System.nanoTime());
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
			
			System.out.println(s.size());
			
			Stopwatch watch = new Stopwatch();
			while(s.size() != 0){
				//System.out.println(s.pop());
				s.pop();
			}
			System.out.println("Tempo: " + watch.elapsedTime());
			System.out.println(s.size());
		
		//}
	}
		
		
		
	
}
