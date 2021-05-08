package exercise3;

public class TextPrinter {

	public static void main(String[] args) {
		
		//create object of runnable
		Runnable textPrinter1 = new ArrayOfText();
		Runnable textPrinter2 = new ArrayOfText();
		Runnable textPrinter3 = new ArrayOfText();
		
		//create object of thread
		Thread printerThread1 = new Thread(textPrinter1,"text");
		Thread printerThread2 = new Thread(textPrinter2,"word1");
		Thread printerThread3 = new Thread(textPrinter3,"word2");
		
		//execute thread
		printerThread1.start();
		printerThread2.start();
		printerThread3.start();
	
	}

}
