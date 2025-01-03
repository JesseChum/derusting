

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
  String[] arr = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
  arr[0]="Donut";
  arr[1]="Cake";
  arr[2]="Cookie";
  arr[3]="Icecream";
    // Get the value of the array at index 2
  String valueAtIndex = arr[2];
    // Get the length of the array
  int[] length = new int[4];
    // Iterate over the array using a traditional for loop and print out each item
   for (int i = 0; i < arr.length; i++){
    System.out.println(i + " : " + arr[i]);
   }
    // Iterate over the array using a for-each loop and print out each item
   for (String item : arr){
    System.out.println(item);
   }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
