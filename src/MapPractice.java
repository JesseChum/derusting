import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
  HashMap<String, Integer> people = new HashMap<String, Integer>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
  people.put("John", 52);
  people.put("Sarah", 43);
  people.put("Charles", 23);
    // Get the value associated with a given key in the Map
  people.get("Charles");
    // Find the size (number of key/value pairs) of the Map
  people.size();
    // Replace the value associated with a given key (the size of the Map shoukld not change)
  people.replace("john", 56);
    // Check whether the Map contains a given key
  people.containsKey("sarah");
    // Check whether the Map contains a given value
  people.containsValue("43");
    // Iterate over the keys of the Map, printing each key
  for (String key : people.keySet()){
    System.out.println(key);
  }
    // Iterate over the values of the map, printing each value
    for (Integer value: people.values()) {
      System.out.println(value);
    }
    // Iterate over the entries in the map, printing each key and value
    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
