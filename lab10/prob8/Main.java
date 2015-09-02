package lab10.prob8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
	
	private static Executor exec = Executors.newCachedThreadPool();
	static int num = 1;
	public static void main(String[] args) {
		
		SynchronizedQueue queue = new SynchronizedQueue();
		
		Runnable add = () -> {			
			queue.add(num++);
		};
		
		Runnable remove = () -> {
			System.out.println(queue.remove());
		};
		
		for(int i = 0; i < 10; ++i) {
			Thread t = new Thread(add);
			t.start();
		}
		for(int i = 0; i < 10; ++i) {
			Thread t = new Thread(remove);
			t.start();
		}
	}
}
