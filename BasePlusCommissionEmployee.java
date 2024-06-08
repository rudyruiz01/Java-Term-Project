// BasePlusCommissionEmployee class extends CommissionEmployee.

public class BasePlusCommissionEmployee extends Employee {
   // constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
   BasePlusCommissionCompensationModel compensation) 
   {
      super(firstName, lastName, socialSecurityNumber, compensation);  // initilize Employee variables
   }

   // return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString() 
   {                                          
      return String.format("%s %s; %s: $%,.2f",                        
         "base-salaried", super.toString());                             
   }                                                                   
} 
