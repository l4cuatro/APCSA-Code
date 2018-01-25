  import java.util.Scanner;
  public class Assignment_5_gourdy {
    public static void main (String[]args) {
    
      Scanner scan = new Scanner (System.in);
      
     
      int pivotIndex;
      
      String[] substr = new String[3];
      
      
      System.out.println("Enter the first string: ");
      String original = scan.nextLine();
      System.out.println(original);
      int originalLength = original.length();
      
      System.out.println("Enter the pivot string: ");
      String pivot = scan.nextLine();
      System.out.println(pivot);
      
      if(!(original.isEmpty() || pivot.isEmpty()) && original.contains(pivot)) {
        int pivotLength = pivot.length();
      
        pivotIndex = original.indexOf(pivot);
        
        substr[0] = original.substring(0, pivotIndex);
        substr[1] = pivot;
        substr[2] = original.substring(pivotIndex+pivotLength);
        
        for(int i = substr.length; i > 0; i--) {
          System.out.print(substr[i-1]);
        }

      }
      else
        System.out.println("Error: Invalid Input");
        
        
      }
    }