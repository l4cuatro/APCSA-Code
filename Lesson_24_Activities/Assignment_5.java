import java.lang.*;
import java.util.*;

public class Assignment_5 {
 
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
  
		String input = "";
		String pivot = "";
	
		System.out.println("Input string");
		input = Scan.nextLine();
		System.out.println("Input pivot");
		pivot = Scan.nextLine();
	
		if(!input.contains(pivot) || pivot.isEmpty())
			System.out.println("Error: invalid pivot");
		
		else {
		
			int pivotIndex = input.indexOf(pivot);
	
			String output = "";
		
			String[] substr =  { input.substring(0, pivotIndex), pivot, input.substring(pivotIndex + pivot.length()) };
	
	
			output = substr[2] + substr[1] + substr[0];
	
			System.out.println("Original: " + input);
			System.out.println("After pivot: " + output);
	
		}
	
	}
 
}