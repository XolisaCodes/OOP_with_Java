
package teststudent;


public class Student {
    
   private String fName;
   private String mName;
   private String lName;
     
   public void setNames(String first, String middle, String last) 
   {
      this.fName = first;
      this.mName = middle;
      this.lName = last;

   }

   public String getFullName() 
   {
      return fName+" "+mName.charAt(0)+". "+lName;
   }
}