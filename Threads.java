package threads;

class Task1 extends Thread{
	public void run() {
		System.out.println("\nTask started");
		
		for(int i = 101; i<=199; i++)
			System.out.println(i+ "");
		System.out.println("\n Task1 Done");
		
	}
}


class Task2 implements Runnable{
	
	public void run() {
		System.out.println("\nTask2 started");
		
		for(int i = 201; i<=299; i++)
			System.out.println(i+ "");
		System.out.println("\n Task2 Done");
		
	}
}

public class Threads {
	public static void main(String[] args) {
		
		//Task1
		Task1 task1 = new Task1();
		task1.start();
		
		//Task2
		System.out.println("\nTask2 kicked off");
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2); //thread class.
		thread.start();
		
		System.out.println("\n Task2 Done");
		//Task3
		for(int i = 301; i<=399; i++)
			System.out.println(i+ "");
		
		System.out.println("\n Task3 Done");
			
	}

}
