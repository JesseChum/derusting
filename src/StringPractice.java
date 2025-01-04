import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
  String txt = "Hotdogs";
    // Find the length of the string
  System.out.println(txt.length());
    // Concatenate (add) two strings together and reassign the result
  String toppingOne = "Stuffed";
  String toppingTwo = "Crust";
  toppingOne = toppingOne + toppingTwo;
  System.out.println(toppingOne);
    // Find the value of the character at index 3
  String findme = "Please find me here";
  System.out.println(findme.indexOf("find"));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
  String substring = "find";
  if(findme.contains(substring)) {
    System.out.println(substring);
  } else {
    System.out.println("There are no substring in " + substring );
  }
    // Iterate over the characters of the string, printing each one on a separate line
  for (int i = 0; i < findme.length(); i++){
    char ch = findme.charAt(i);
    System.out.println(ch);
  }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> bedroom = new ArrayList<String>();
    
    // Add multiple strings to the List (OK to do one-by-one)
    bedroom.add("bed");
    bedroom.add("table");
    bedroom.add("lamp");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(",", bedroom);
    System.out.println(joinedString);
    // Check whether two strings are equal
   String f1 ="football";
   String f2 = "soccerball";
   String f3 ="football";
   System.out.println(f1.equals(f2));
   System.out.println(f1.equals(f3));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
