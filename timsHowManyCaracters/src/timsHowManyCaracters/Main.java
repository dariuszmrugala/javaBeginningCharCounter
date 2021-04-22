package timsHowManyCaracters;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map<Character, Integer> map_of_how_many_chars = new LinkedHashMap<Character, Integer>();
		
//		String my_string = "Darek ma 3 koty.";
//		System.out.println(my_string);
		
		@SuppressWarnings("resource")
		Scanner my_scanner = new Scanner(System.in);
		String my_string = my_scanner.nextLine();

		if (my_string.isEmpty()) {
			System.out.println("your string is empty. that's the end!");
			return;
		}
		
		for(int counter = 0 ; counter < my_string.length() ; ++counter)
		{
//			System.out.println(my_string.charAt(counter));
			
			char char_from_string = my_string.charAt(counter);
			if(map_of_how_many_chars.containsKey(char_from_string)) {
				int how_many_chars = (int) map_of_how_many_chars.get(char_from_string);
				map_of_how_many_chars.put(char_from_string, ++how_many_chars);	
			}
			else
			{
				map_of_how_many_chars.put(char_from_string, 1);				
			}
			
		}
		
		System.out.println(map_of_how_many_chars);
		
	}

}
