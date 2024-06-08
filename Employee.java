// Employee abstract superclass that implements Payable.

public abstract class Employee {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private CompensationModel compensation;

   // constructor
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber, CompensationModel compensation) 
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.compensation = compensation;
   } 

   // set compensation package
   public void setCompensation(CompensationModel compensation) { this.compensation = compensation; }

   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number
   public String getSocialSecurityNumber() {return socialSecurityNumber;}

   // return earnings
   public double earnings() { return compensation.earnings(); }

   // return String representation of Employee object
   @Override
   public String toString() {
      return String.format("%s %s%nsocial security number: %s%n%s", 
         getFirstName(), getLastName(), getSocialSecurityNumber(), compensation.toString());
   }     
} 
