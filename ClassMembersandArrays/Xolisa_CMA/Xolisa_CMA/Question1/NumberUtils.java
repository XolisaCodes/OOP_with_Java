
 import java.util.Arrays;

public class NumberUtils{

  private NumberUtils(){
 
  }

  public static int[] toArray(int number){
 
    String numberString = String.valueOf(number);
    int[] digitsArray = new int[numberString.length()];
    for (int i = 0; i < numberString.length(); i++) {
      char c = numberString.charAt(i);
      int digit = (int) c;
      int zero = (char) '0';
      digitsArray[i] = digit - zero;
    }
    return digitsArray;
  }
  public static int countMatches(int numberA, int numberB){
  
    int[] arrayA = toArray(numberA);
    int[] arrayB = toArray(numberB);
    int count = 0;
    for (int i = 0; i < arrayA.length; i++) {
        if (arrayA[i] == arrayB[i]) {
          count++;
        } else;
      }
    return count;
  }


  public static int countIntersect(int numberA, int numberB){
   
    int[] arrayA = toArray(numberA);
    int[] arrayB = toArray(numberB);
    int count = 0;
    for (int i = 0; i < arrayA.length; i++) {
      for (int j = 0; j < arrayB.length; j++) {
        if (arrayA[i] == arrayB[j]) {
          count++;
        } else;
      }
    }
    return count;

  }
}