package MultiThreading_Concepts;


class mythread extends Thread{
	
	public void run() {
		System.out.println("NO args");
	}
	
	public void run(int i) {
		System.out.println("int i args");
	}
}
public class ExtendingThread_Overload_Run_Method {

	public static void main(String[] args) {
		mythread t = new mythread();
		t.start();
		t.run(5);

	}

}
