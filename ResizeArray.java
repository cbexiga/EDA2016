package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

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
		
	
}
