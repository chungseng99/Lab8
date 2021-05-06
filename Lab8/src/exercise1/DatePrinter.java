package exercise1;

public class DatePrinter {

	public static void main(String[] args) {
		
		//create Thread object
		Thread datePrinter1 = new CurrentTime();
		Thread datePrinter2 = new CurrentTime();
		
		//set name of thread
		datePrinter1.setName("Printer1");
		datePrinter2.setName("Printer2");
		
		//execute threads
		datePrinter1.start();
		datePrinter2.start();

	}

}
