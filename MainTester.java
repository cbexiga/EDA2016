package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainTester {
	
	//Método a testar, fazer classe abstrata e fazer herdar as arrays class'.
	/*public void test(Object teste, int time){
		Scanner scanner;
		
		try{
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
			Stopwatch watch = new Stopwatch();
			
			while(scanner.hasNext()){
				
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}*/


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner scanner;
		FixedArray<Integer> fixed = new FixedArray<Integer>(100000);
		ResizeArray<Integer> resized = new ResizeArray<Integer>();
		Stack<Integer> node = new Stack<Integer>();

		
		//INSERIR O TIPO DE DADO A SER UTILIZADO
		try {
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
			Stopwatch watch = new Stopwatch();
			
			while(scanner.hasNext()){
				fixed.push(scanner.nextInt());
			}
			
			System.out.println("Demorou a inserir: " + watch.elapsedTime());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fixed.sizeOfItems());
		
		Stopwatch watch = new Stopwatch();
		while(fixed.sizeOfItems() != 0){
			fixed.pop();
		}
		System.out.println("Demorou a retirar: " + watch.elapsedTime());
		
		Thread.sleep(15000);
		
		try {
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
			Stopwatch watch2 = new Stopwatch();
			
			while(scanner.hasNext()){
				resized.push(scanner.nextInt());
			}
			
			System.out.println("Demorou a inserir: " + watch2.elapsedTime());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Stopwatch watch2 = new Stopwatch();
		while(resized.size() != 0){
			resized.pop();
		}
		System.out.println("Demorou a retirar: " + watch2.elapsedTime());
		
		Thread.sleep(15000);
		
		try {
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
			Stopwatch watch3 = new Stopwatch();
			
			while(scanner.hasNext()){
				node.push(scanner.nextInt());
			}
			
			System.out.println("Demorou a inserir: " + watch3.elapsedTime());
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Stopwatch watch3 = new Stopwatch();
		while(node.size() != 0){
			node.pop();
		}
		System.out.println("Demorou a retirar: " + watch3.elapsedTime());
	}

}
