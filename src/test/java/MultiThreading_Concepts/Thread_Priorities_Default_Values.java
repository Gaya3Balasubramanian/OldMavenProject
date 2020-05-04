package MultiThreading_Concepts;

public class Thread_Priorities_Default_Values extends Thread {
	
	public void run() {
		System.out.println("Check");
	}
	

	public static void main(String[] args) {
		Thread_Priorities_Default_Values g= new Thread_Priorities_Default_Values();
		//System.out.println(Thread.currentThread().getPriority());
		g.setPriority(6);
		System.out.println(g);
		g.start();
		
	}

}
