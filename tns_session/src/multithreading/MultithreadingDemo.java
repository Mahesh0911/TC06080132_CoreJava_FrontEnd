package multithreading;

public class MultithreadingDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
	
	}
	public static void main(String[] args) {
		MultithreadingDemo threadOneDemo =new MultithreadingDemo(); //born state
		MultithreadingDemo threadTwoDemo =new MultithreadingDemo(); //born state
		
		threadOneDemo.start();
		threadTwoDemo.start();
		
		
	}
}


/*
 *	Demystifying Multi :
 *		Multitasking : doing more than one task at a time.
 *		Multiprocessing : running more than one process simultaneously.
 *		WinAmp = listening songs
 *		WinWord = creating a document
 *		Multithreading =running multiple threads concurrently
 *		
 * 
 * 	MultiProcessing - Context Switch
 * 		When OS switching between process to process , data needs to be stored temporarily.
 * 		Data to be stored : Context
 * 			-Instruction Set
 * 			-Current Instruction
 * 			-Current data structures in use
 * 		Processes do not share the same data,hence context switch is resource heavy.
 * 		Scheduling of process is controlled by OS : 
 * 			two ways :
 * 				1) Pre-emptive
 * 				2) Non Preemptive (Co-operative)
 * 
 * 		Thread :
 * 			Not all modules are dependent on earlier modules.
 * 			While the system responds to a modules request, CPU remains idle.
 * 			This idle time can be utilized by queuing up other tasks of the process with (CPU).
 * 			Such independent intra-process executions are called as threads.
 * 
 * 		Thread : 
 * 			A thread is a lightweight, smallest unit of processing.
 * 			A process is made up of multiple threads.
 * 			Each thread has its own stack(runtime stack) to handle its data.
 * 			A thread shares the memory space with other threads of the same process.
 * 		When to use MultiThreading :
 * 			Performing operations that take a large amount of time.
 * 			Prioritization of tasks.
 * 			Application has to wait for some event to occur.
 * 
 * 		Thread Lifecycle :
  		**** new  ->  runnable  <->  running  ->  dead
                                        |
                                        |
                                        |
                                        |(Blocked)
                       ----------------------------------------
                       |                   |                  | 
                    sleeping             waiting            IO block   
 * 			
 */
