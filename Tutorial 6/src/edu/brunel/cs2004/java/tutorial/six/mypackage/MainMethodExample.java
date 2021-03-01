package edu.brunel.cs2004.java.tutorial.six.mypackage;

public class MainMethodExample {
	public static void main(String[] args) {
		//Iterate through each element in the Parameter Array args
		for (int i = 0; i < args.length; i++) {
			 String input = args[i];
	        // getBytes() method to convert word into bytes[].
	        	 byte[] strAsByteArray = input.getBytes();
	        	 byte[] word = new byte[strAsByteArray.length];
	        // Store word in reverse order into the
	        // result byte[]
	        	 for (int j = 0; j < strAsByteArray.length; j++) {
	        		 word[j] = strAsByteArray[strAsByteArray.length - j - 1];
	        	 }
	        
	        // Output the word with a space afterwards.
	        	 System.out.print(new String(word) + " ");
		}
	}
}
