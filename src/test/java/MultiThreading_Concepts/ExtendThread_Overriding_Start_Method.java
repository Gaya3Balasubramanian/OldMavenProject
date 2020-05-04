package MultiThreading_Concepts;

class mythread1 extends Thread{
	public void start() {
		super.start();
		System.out.println("Start Method");
	}
	
	public void run() {
		System.out.println("Run method");
	}
}


public class ExtendThread_Overriding_Start_Method {

	public static void main(String[] args) {
		mythread1 t= new mythread1();
		t.start();
		System.out.println("Main thread");

	}

}
