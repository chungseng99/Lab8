package exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentTime extends Thread{
	
	public void displayTime (String currentThread) {
		
		// create date format
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		 
		 //create date object
		 Date date = new Date();  
		 
		 //loop 10 times to print current time
		 for(int i=0; i<10; i++) {
			 
			  System.out.println(currentThread + " --> " + formatter.format(date));
		 }
		 
				
	}
	
	public void run() {
		
		//get current Thread
		Thread currentThread = Thread.currentThread();
		
		//execute task
		displayTime(currentThread.getName());
		
	}

}
