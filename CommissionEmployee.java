// CommissionEmployee class extends Employee.

public class CommissionEmployee extends Employee {
   // constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, CommissionCompensationModel compensation) 
   {
      super(firstName, lastName, socialSecurityNumber, compensation);
   }

   // return String representation of CommissionEmployee object
   @Override                                                   
   public String toString() {                                  
      return String.format("%s: %s%n%s",     
         "commission employee", super.toString());              
   }
} 
