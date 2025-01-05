import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> helicopters = new HashSet<String>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    helicopters.add("Huey");
    helicopters.add("Mi24");
    helicopters.add("cobra");
    // Check whether the Set contains a given String
    System.out.println("Does the set contain 'Mi24' ?" + helicopters.contains("Mi24"));
    // Remove an element from the Set
    helicopters.remove("Huey");
    // Get the size of the Set
    int size = helicopters.size();
    System.out.println("The set size is: " + size);
    // Iterate over the elements of the Set, printing each one on a separate line
    for (String helicopter : helicopters){
      System.out.println(helicopter);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
