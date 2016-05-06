package pt.europeia.eda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;


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

	
	/*
	 * int numberOfExperiments = 5;
		
		while(numberOfExperiments != 0){
			//INSERIR O TIPO DE DADO A SER UTILIZADO
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
			
			Thread.sleep(2000);
			
			try {
				scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
				Stopwatch watch2 = new Stopwatch();
				
				while(scanner.hasNext()){
					resized.push(scanner.nextInt());
				}
				
				System.out.println("Demorou a inserir no resized array: " + watch2.elapsedTime());
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			Stopwatch watch2 = new Stopwatch();
			while(resized.size() != 0){
				resized.pop();
			}
			System.out.println("Demorou a retirar no resized array: " + watch2.elapsedTime());
			System.out.println("------------------------------");
			
			Thread.sleep(2000);
			
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
			//System.out.println(numberOfExperiments);
		}
	}
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Scanner scanner;
		FixedArray<Integer> fixed = new FixedArray<Integer>(100000);
		ResizeArray<Integer> resized = new ResizeArray<Integer>();
		Stack<Integer> node = new Stack<Integer>();
		
		/*
		int number = 10;
		int numberOfExperiments = 5;
		Stopwatch timer = new Stopwatch();
		while(numberOfExperiments != 0){
			for(int i = 0; i <= Math.pow(2, 20); i++){
				node.push(number);
				System.out.println("Demorou a inserir " + timer.elapsedTime());
			}
			numberOfExperiments--;
			
		}*/
		/*
		int number = 10;
		
		long start = System.currentTimeMillis();
		long stop = start+5000;
		
		while(System.currentTimeMillis() < stop){
			for(int i = 0; i <= Math.pow(2, 20); i++){
				Stopwatch timer = new Stopwatch();
				resized.push(number);
				if(resized.size() > 20){
					for(int j = 0; j < 20; j++){
						resized.pop();
					}
				}
				System.out.println("Demorou a inserir: " + timer.elapsedTime() + "\nTamanho do array: " + resized.size());
			}
		}
		*/
		
		//Segunda parte do trabalho
		InsertionSort iSort = new InsertionSort();
		int[] kints1Array = new int[1000];
		int i = 0;
		
		try{
			scanner = new Scanner(new File("C:\\Users\\ricardon\\eda-2015-2016\\EDA 2015-2016\\data\\1Kints.txt"));
			Stopwatch timer = new Stopwatch();
			while(scanner.hasNext()){
				
				kints1Array[i++] = scanner.nextInt();
				
				
			}
			
				System.out.println(Arrays.toString(iSort.sort(kints1Array)));
			
			
			System.out.println("\nTime: " + timer.elapsedTime());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
