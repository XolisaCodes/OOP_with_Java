
package testuberservice;


public class UberService {
    
   String uberName;
   int baseFare;
   int costPerMinute;
   int costPerKilometre;
   int cancellationFee;
   
   void setDetails(String name, int costPerMin, int costPerKM, int baseFee, int cancellationFee)
   // Set the details of this service to the given values.
   {this.uberName=name;
   this.costPerMinute=costPerMin;
   this.costPerKilometre=costPerKM;
   this.baseFare=baseFee;
   this.cancellationFee=cancellationFee;}
   
   
   void setName(String name)
   // Set the service name.
   {this.uberName=name;}
   
   String getName()
   // Obtain the service name.
   {return this.uberName;}
   
   void setCostPerMinute(int cents)
   // Set the cost per minute.
   {this.costPerMinute=cents;}   
   
   int getCostPerMinute()
   //Set the cost per minute in cents.
   {return this.costPerMinute;}
   
   void setCostPerKilometre(int cents)
   //Set the cost per kilometre.
   {this.costPerKilometre=cents;}
   
   int getCostPerKilometre()
   // get the cost per kilometre in cents.
   {return this.costPerKilometre;}
      
   void setBaseFare(int cents)
   // Set the base fare.
   {this.baseFare=cents;}
   
   int getBaseFare()
   // get the base fare in cents.
   {return this.baseFare;}
   
   void setCancellationFee(int n)
   // Set the cancellation fee.
   {this.cancellationFee=n;}
   
   int getCancellationFee()
   // Obtain the cancellation fee in cents for this service.
   {return this.cancellationFee;}
   
   double calculateFare(double minutes, double distance)
   // Obtain the fare (in the form of a real number of cents) for a journey of the 
   // given time and  distance.
   {return baseFare + costPerMinute*minutes + costPerKilometre*distance;}
}