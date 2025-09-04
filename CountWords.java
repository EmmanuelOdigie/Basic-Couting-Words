package JavaCountWords;// project made in eclipse

public class CountWords {// public class 'CountWords' created

	public static void main(String[] args) {// reads,runs & executes code
		String words = "Hi how are you"; // created String variable 'words' 
		// created String(txt) in quotas
		int count = words.split("\\s").length; // created an integer variable 'count'
		// 'words.split("\\s").length" counts the amount of words in the text and stores the value in 
		// int variable 'count'
		
		System.out.println(count); // display the number of text

	}

}

//result:
//4