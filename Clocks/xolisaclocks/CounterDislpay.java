
package testcounter;

public class CounterDisplay {
    // instance variables
  private int limit;
  private int value;

  // constructors
  public CounterDisplay(int pLimit){
    value = 0;
    limit = pLimit - 1;
  }

  // methods
  public void setValue(int pValue){
    value = pValue;
  }

  public int getValue(){
    return value;
  }
  public void increment(){
    // advance the value by one
    if (value < limit) {
      value++;
    } else if (value == limit){
      value = 0;
    } else;
  }

  public String getDisplayValue(){
    return (""+(100+value)).substring(1);
  }  
}
