package pt.europeia.eda;

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
	
	
}
