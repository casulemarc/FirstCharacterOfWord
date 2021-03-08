/**
 * Write a method f that accepts an ArrayList containing String objects.
 * The method should return a String containing the first character of each string in the ArrayList, 
 * in the order in which they appear.
 * Thus, if the ArrayList contains the Strings: "Hello world goodbye", 
 * the return value of the method would be the String Hwg
 */

import java.util.ArrayList;

public class FirstCharacterOfWord {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		
		list.add("Hello");
		list.add("world");
		list.add("goodbye");
		
		String myLetter = f(list);
		
		System.out.println(myLetter);

	}
	
	public static String f(ArrayList<String> words){
	    String letter = "";
	    for(int k = 0; k < words.size(); k++){
	        letter += words.get(k).charAt(0);
	    }
	    return letter;
	}

}
