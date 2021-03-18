package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*Input - {"dog", "cat", "act", "abc", "god", "bbc"}
Output - {("abc"), ("bbc"), ("dog", "god"), ("cat", "act")}*/

public class Annagram2 {
	
	private static void printAnagrams(String arr[])  
    {  
        HashMap<String, List<String> > map = new HashMap<>();  
  
        // loop over all words  
        for (int i = 0; i < arr.length; i++) {  
  
            // convert to char array, sort and  
            // then re-convert to string  
            String word = arr[i];  
            char[] letters = word.toCharArray();  
            Arrays.sort(letters);  
            String newWord = new String(letters);  
  
            // calculate hashcode of string  
            // after sorting  
            if (map.containsKey(newWord)) {  
  
                map.get(newWord).add(word);  
            }  
            else {  
  
                // This is the first time we are  
                // adding a word for a specific  
                // hashcode  
                List<String> words = new ArrayList<>();  
                words.add(word);  
                map.put(newWord, words);  
            }  
        }  
  
        // print all the values where size is > 1  
        // If you want to print non-anagrams,  
        // just print the values having size = 1  
        for (String s : map.keySet()) {  
            List<String> values = map.get(s);  
            if (values.size() > 1) {  
                System.out.print(values);  
            }  
        }
    }  
  
    public static void main(String[] args)  
    {  
        
        String[] input = {"dog", "cat", "act", "abc", "god", "bbc"};
        printAnagrams(input);  
    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void isAnagram(String input1, String input2){
        //Remove all whitespace first
        String  s1= input1.replaceAll("\\s", "");
 
        String s2 = input2.replaceAll("\\s", "");
        
        boolean status = true;
 
        if(s1.length() != s2.length())
        {
            status = false;
        }else {
            //Convert into character array
 
            char[] s1Array = s1.toLowerCase().toCharArray();
 
            char[] s2Array = s2.toLowerCase().toCharArray();
 
            //Sorting both character array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Check if both arrays are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
        if(status){
            System.out.println("(" +s1+","+s2 +")");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }*/
	
}
