
package meteorology;
import java.util.Scanner;
public class Meteorology {

    public static void main(String[] args) {
     
    Scanner keyboard = new Scanner(System.in);

    int selection;

    Collator temperature = new Collator("temperature");
    Collator pressure = new Collator("pressure");
    Collator humidity = new Collator("humidity");

    System.out.println("Meteorology Program");

    do {
     
      System.out.println("Make a selection and press return:");
      System.out.println("1. Record a temperature reading.");
      System.out.println("2. Record a pressure reading.");
      System.out.println("3. Record a humidity reading.");
      System.out.println("4. Print maximum values.");
      System.out.println("5. Print minimum values.");
      System.out.println("6. Print average values.");
      System.out.println("7. Quit.");

      selection = keyboard.nextInt();
      if (selection == 1) {
        System.out.println("Enter a value:");
        int temp = keyboard.nextInt();
        temperature.recordReading(temp);
      } else if (selection == 2) {
        System.out.println("Enter a value:");
        int atm_pressure = keyboard.nextInt();
        pressure.recordReading(atm_pressure);
      } else if (selection == 3) {
        System.out.println("Enter a value:");
        int hum = keyboard.nextInt();
        humidity.recordReading(hum);
      }

      else if (selection == 4) {
        if (temperature.maximum() == 0) {
          System.out.println("Maximum temperature: " + "-");
        } else {
          System.out.println("Maximum temperature: " + temperature.maximum());
        }
        if (pressure.maximum() == 0) {
          System.out.println("Maximum pressure: " + "-");
        } else {
          System.out.println("Maximum pressure: " + pressure.maximum());
        }
        if (humidity.maximum() == 0) {
          System.out.println("Maximum humidity: " + "-");
        } else {
          System.out.println("Maximum humidity: " + humidity.maximum());
        }
       
      }
      else if (selection == 5) {
        if (temperature.minimum() == 0) {
          System.out.println("Minimum temperature: " + "-");
        } else {
          System.out.println("Minimum temperature: " + temperature.minimum());
        }
        if (pressure.minimum() == 0) {
          System.out.println("Minimum pressure: " + "-");
        } else {
          System.out.println("Minimum pressure: " + pressure.minimum());
        }
        if (humidity.minimum() == 0) {
          System.out.println("Minimum humidity: " + "-");
        } else {
          System.out.println("Minimum humidity: " + humidity.minimum());
        }

       
      }
      else if (selection == 6) {
        if (Double.isNaN(temperature.average())) {
          System.out.println("Average temperature: " + "-");
        } else {
          System.out.println("Average temperature: " + String.format( "%.2f", temperature.average() ));
        }
        if (Double.isNaN(pressure.average())) {
          System.out.println("Average pressure: " + "-");
        } else {
          System.out.println("Average pressure: " + String.format( "%.2f", pressure.average() ));
        }
        if (Double.isNaN(humidity.average())) {
          System.out.println("Average humidity: " + "-");
        } else {
          System.out.println("Average humidity: " + String.format( "%.2f", humidity.average() ));
        }
    
      } else;

    } while (selection != 7);
  
  }
}