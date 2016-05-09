package pt.europeia.eda;


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
	
	
}
