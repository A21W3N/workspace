package hu.ttk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main  {
	
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
	File fileName = new File("C:\\Users\\Vincze Benjámin\\Desktop\\pls.text");
	
	try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
			{
				String line;
				while((line = br.readLine()) != null){
					sb.append(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (sb != null){
				countLetters(sb.toString());
			}
}

public static void countLetters(String text){
	Map<Character, Integer> letters = new HashMap<>();
	
	
	
	for(int i=0; i<text.length(); i++){
		
		if(letters.containsKey(text.charAt(i))){
			letters.put(text.charAt(i), letters.get(text.charAt(i)) +1);
		}
		else {
			letters.put(text.charAt(i), 1);
		}
		
	}
	
	for (Map.Entry<Character, Integer> entry : letters.entrySet()){
		System.out.println(entry.getKey()+" : " + entry.getValue());
	}
}
}