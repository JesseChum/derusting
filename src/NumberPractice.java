public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float f = -1f;
    System.out.println(f);

    // Create an int with a positive value and assign it to a variable
    int num = 5;
    System.out.println(num);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = num % 3;
    System.out.println(remainder);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    int number = 6;
    if (number % 2 == 0) {
      System.out.println(number + " is even");
      // if the number is odd.
    } else {
      System.out.println(number + "is odd");
    }
    
    // Divide the number by another number using integer division
    int x = 8;
    int y = 4;
    System.out.println(x/y);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
