package MultiThreading_Concepts;


class mythread3 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}

public class Thread_Priorities {

	public static void main(String[] args) {
		mythread3 t= new mythread3();
		t.setPriority(10);
	/*	If we comment t.setPriority(10) then we cant expect execution order. 
		f we are not commenting t.setPriority(10) then main thread has a priority 5
		and child thread has a priority 10.hence child thread will get chance first 
		followed by main thread . In this case output is main child thread 10 times
		 followed by main thread 10 times
		 
		Note: Some platforms wont provide proper support for thread priorities
		
		 
		 
		 */
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}

	}

}
