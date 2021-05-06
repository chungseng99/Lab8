package exercise2;

public class TextPrinter {

	public static void main(String[] args) {
		
		//create runnable object
		Runnable textPrinter1 = new ArrayOfText();
		Runnable textPrinter2 = new ArrayOfText();
		
		
		
		//create thread object
		Thread printerThread1 = new Thread(textPrinter1,"text");
		Thread printerThread2 = new Thread(textPrinter2,"word1");
		
		//execute thread
		printerThread1.start();
		printerThread2.start();
		
	}

}
