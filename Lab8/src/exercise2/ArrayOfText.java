package exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayOfText implements Runnable{
	
	//create array
	String text[] = {"It","is","recommended","to","use","calender","class"};
	
	public void displayText(String currentThread) {
		
		
		String word = "";
		
		for(int i=0;i<10;i++) {
			
			if(i<7) {
				
				//append the text together
				word = word.concat(text[i]+" ");
				System.out.println(currentThread + "-->" + word);
				
			}
			else if(i>=7)
				
				System.out.println(currentThread + "-->" + word);
			
		}
		
	}
	
	public void shuffleText(String currentThread) {
		
		//convert array into list
		List<String> textList = Arrays.asList(text);
		
		//shuffle the list
		Collections.shuffle(textList);
		
		//convert back to array 
		textList.toArray(text);
		
		String message = "";
		for(String currentText:text) {
			
			//append text in the array
			message = message.concat(currentText+ " ");
			
		}
			
		
		System.out.println(currentThread + "-->" + message);
	}
		
		
	

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		
		if(currentThread.getName().contentEquals("text")) {
			
			displayText(currentThread.getName());
		
		}
		
		else if(currentThread.getName().contentEquals("word1")) {
			
			shuffleText(currentThread.getName());
			
		}
	}

}
