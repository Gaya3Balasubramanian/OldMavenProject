package MultiThreading_Concepts;

public class Thread_Explanation {
	
	/*1.What is Thread?
	    Thread is a separate flow of execution. Each thread will have separate job.
	    
	  2.Thread can be defined in following way:
	    1.By extending thread class
	    2.By implementing runnable interface
	    
	  3.By extending thread class:     
	    created Extendingthread_1(),Extendingthread_2() and calling those methods in
	    Extendingthread_3().And also another program written in main method.
	    so main method is executing program which is calling from child class and also executing
	    the another program which is written in the main method simultaneously 
	    
	    
	   4. Case 1:Thread Scheduler :
	     It is a part of JVM . It is responsible to schedule threads i.e if multiple threads
	     are waiting to get chance of execution then in which order threads will be executed 
	     is decided by thread scheduler.We can't expect exact algorithm followed by thread scheduler
	     It is varied from JVM to JVM.Hence we cant expect thread execution order and exact output.
	     hence whenever situation comes to multithreading there is no guarantee for exact output.
	     But we can provide several possible outputs.
	     
	     Case 2: Difference between t.Start and t.run
	     In that case of t.Start new thread will be created which is responsible for the 
	     execution of run method .But in the case of t.run a new thread wont be created
	     and run method will be executed just like a normal method a call by main thread.
	     Hence in the program if i replace t.start with t.run then output is child thread ten times 
	     followed by main thread ten times. This total output produced by only main thread.
	     
	     Case 3: Importance of thread.start method(i.e t.start)
	     thread class start method is responsible to register the thread with thread scheduler and all
	     other mandatory activities. Hence without executing thread class start method there is 
	     no chance of starting a new thread in Java ever due to this thread class start method
	     is considered as heart of multithreading.
	     
	     Case 4: Overloading of run method
	     Overloading of run method is always possible but thread class start method can
	     invoke no argument run method.The other overloaded method we have to call 
	     explicitly like a normal method call.
	     
	     
	     Case 5: If we are not overriding run method 
	     If we are not overriding run method then thread class run method will be executed
	     which has empty implementation . Hence we wont get any output .It is highly recommended
	     to override run method otherwise dont go for multithreading concept.
	     
	     Case 6: Overriding of start method
	     If we override start method then our method start method will be executed just like 
	     a normal method call and new thread wont be created . It is not recommended to override 
	     the start the start method otherwise dont go for multithreading concept.If we use
	     super in the start method it will call the thread class start method and now it
	     will run all the methods.
	     
	     Case 7:
	     If we use super in the start method it will call the thread class start method and now it
	     will run all the methods.
	     
	     Case 8: Thread Lifecycle:
	             t.start               If T.S allocates processor		 If run method completes		
	     New Born------->Ready/Runnable-------------------------->Running----------------------->
	     dead
	     
	     Case 9:After starting a thread if we are trying to restart the same thread then we
	     will get run time exception saying illegal thread state exception
	     
	       
	     
	 */

}
