package MultiThreading_Concepts;

public class Extendingthread_5 {

	public static void main(String[] args) {
		Extendingthread_1 t= new Extendingthread_1();//thread instantiation
		t.start();// starting a child thread
		//t.start();
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");// executing a main thread
		}

	}

}
