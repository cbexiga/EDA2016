package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stack <Item>{
	
	private Node first;
	private int numberOfItems;
	
	private class Node{
		Item item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return numberOfItems;
	}
	
	public void push(Item item){
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		numberOfItems++;
	}
	
	public Item pop(){
		Item item = first.item;
		first = first.next;
		numberOfItems--;
		return item;
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> node = new Stack<Integer>();
		int numberOfExperiments = 5;
		Scanner scanner;
		
		while(numberOfExperiments != 0){
			try {
				scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
				Stopwatch watch3 = new Stopwatch();
				
				while(scanner.hasNext()){
					node.push(scanner.nextInt());
				}
				
				System.out.println("Demorou a inserir no node: " + watch3.elapsedTime());
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			Stopwatch watch3 = new Stopwatch();
			while(node.size() != 0){
				node.pop();
			}
			System.out.println("Demorou a retirar no node: " + watch3.elapsedTime());
			System.out.println("------------------------------");
			System.gc();
			numberOfExperiments--;
		}
		
		
		
	}
}
