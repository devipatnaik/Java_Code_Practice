package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*Input - {"dog", "cat", "act", "abc", "god", "bbc"}
Output - {("abc"), ("bbc"), ("dog", "god"), ("cat", "act")}*/

public class Annagram {
	
	private static void printAnagrams(String arr[])  
    {  
        HashMap<String, List<String> > map = new HashMap<>();  
  
        for (int i = 0; i < arr.length; i++) {  
  
            String word = arr[i];  
            char[] ch = word.toCharArray();  
            
            Arrays.sort(ch);  
            
            String newWord = new String(ch);  
  
            if (map.containsKey(newWord)) {  
  
                map.get(newWord).add(word);  
            }  
            else {  
  
                List<String> words = new ArrayList<>();  
                words.add(word);  
                map.put(newWord, words);  
            }  
        }  
  
        for (String s : map.keySet()) {  
            List<String> value = map.get(s);  
            if(value.size() > 1) {
                System.out.print(value);
            } else {
            	System.out.println(value);
            }
        }
    }  
  
    public static void main(String[] args)  
    {  
        
        String[] input = {"dog", "cat", "act", "abc", "god", "bbc", "bca", "ddddsss"};
        printAnagrams(input);  
    } 
	
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
	

