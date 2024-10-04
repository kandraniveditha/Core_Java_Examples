package com.itbulls.leranjava.corejava.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("===== String Methods=====");
		System.out.println();
		
		String s = "hello";
		System.out.println("s.length(): "+ s.length()); //5
		System.out.println("s.contains(\"he\"): " + s.contains("he")); //true
		System.out.println("s.isEmpty: " + s.isEmpty());  //false
		System.out.println("s.toUpperCase(): " + s.toUpperCase());  //HELLO
		System.out.println("s.startWity(\"h\"): " + s.startsWith("h")); //true
		System.out.println("s.endsWith(\" \"): " + s.endsWith(" ")); //false
		System.out.println("s.replace(\"11\", \"LL\"): " + s.replace("11", "LL")); //hello
		System.out.println("s.trim(): " + s.trim()); //hello
		System.out.println("s.strip(): " + s.strip()); //hello
		System.out.println("s.subString(0,3): " + s.substring(0, 3));  //hel
	   
		System.out.println("Array.toString(s.getBytes()): "  
	    		+ Arrays.toString(s.getBytes()));   //[104, 101, 108, 108, 111]
	    
	    System.out.println("Arrays.toString(s.toCharArray()): " 
	    		+ Arrays.toString(s.toCharArray())); // [h, e, l, l, o]
	    
	    System.out.println("s.charAt(1): " + s.charAt(1));  //e
	    
	    System.out.println("Arrays.toString(s.split(\"e\")): "
	    + Arrays.toString(s.split("e")));  //  [h, llo]
	    
	    System.out.println(s);  //hello
	    
	    System.out.println();
	    System.out.println("=========== String Comparsion ========");
	    System.out.println();
	    
	    String s2 = " hello ";
	    System.out.println("s == s2: " + (s == s2));  //false
	    
	    String s3 = new String(" hello ");
	    System.out.println("s == s3: " + (s == s3));  //false
	    System.out.println("s.equals(s3): " + s.equals(s3));  // false
	    System.out.println("s == s3.intern(): " + (s == s3.intern())); //false
	    
	    String firstName = "Niveditha";
	    String FirstName2 = "niveditha";
	    System.out.println("firstName.equals(firstName2): "
	    		+ firstName.equals(FirstName2));  //false
	    
	    System.out.println("firstName.equalsIgnoreCase(firstName2): " 
	    + firstName.equalsIgnoreCase(FirstName2));   //true
	    
	    System.out.println();
	    System.out.println("====== Escape Sequences =====");
	    System.out.println();
	    
	    System.out.println("My favourite book is \"The one tging\" by Gary Keller.");  //My favourite book is "The one tging" by Gary Keller.
	    System.out.println("Path to the source code: D:\\Java\\sources");   //Path to the source code: D:\Java\sources
	    
	   /*
	    * \t - tab
	    * \b - backspaces (a step backward in the text or deletion of a single character).
	    * \ n - new line.
	    * \r - carriage return.()
	    * \f - form feed
	    * \' - single quote
	    * \" - double quote
	    * \\ - backslash
	    */
	    
	    System.out.println("Some text line 1\nsome text line 2"); //Some text line 1
	                                                              // some text line 2
	    
        System.out.println("Unicode characters, \u00A9 IT-Bulls.com");     //Unicode characters, © IT-Bulls.com
	    
	    
	    System.out.println();
	    System.out.println("=======String Formating =======");
	    System.out.println();
	    
	    String greetingTemplate = " Hello, dear %s! Good %s!";
	    
	    String morning = "morning";
	    String afternoon = "afternoon";
	    String evening = "evening";
	    String formattedString = String.format(greetingTemplate, firstName, morning);  
	    System.out.println(formattedString);                // Hello, dear Niveditha! Good morning!
	    
	    System.out.printf("You have %d computers available at store\n", 10);       //You have 10 computers available at store
	    
	    System.out.println();
	    System.out.println("========= Regular Expressions ========");
	    System.out.println();
	    
	    String gemailPattern ="[a-zA-Z-\\d]+@gmail\\.com";
	    Pattern p = Pattern.compile(gemailPattern);
	    String sampleText = "Some random text that contains gmail addresses" 
	    		+ "Like this one some-email@gamil.com and Some other random text.";
	    Matcher m = p.matcher(sampleText);
	    
	    m.find();
	    String gmailAddress = m.group();
	    System.out.println(gmailAddress);  //some-email@gamil.com
	    
	    String sampleText2 = "There are three sentences in this String. Are you sure? yes!";
	    String[] sentences = sampleText2.split("[\\.!?]");
	    System.out.println(Arrays.toString(sentences));  //[There are three sentences in this String, Are you sure, yes]
	}

}
