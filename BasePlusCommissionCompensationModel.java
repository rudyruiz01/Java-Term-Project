public class BasePlusCommissionCompensationModel extends CompensationModel {
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage
   private double baseSalary; // base salary

   // constructor
   public BasePlusCommissionCompensationModel( double grossSales, double commissionRate, double baseSalary) 
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      if (grossSales < 0.0) { // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }

      if (baseSalary < 0.0)   // validate
      {
         throw new IllegalArgumentException("Base salary must be > 0.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
      this.baseSalary = baseSalary;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) { // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() {return grossSales;}

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {return commissionRate;}

   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)   // validate
      {
         throw new IllegalArgumentException("Base salary must be > 0.0");
      }

      this.baseSalary = baseSalary;
   }

   public double getBaseSalary() { return this.baseSalary; }

   // calculate earnings; override abstract method earnings in CompensationModel                                                                
   @Override
   public double earnings()
   {
      return getBaseSalary() + getCommissionRate() * getGrossSales();     
   }

   // return String representation of CommissionEmployee object
   @Override                                                   
   public String toString() 
   {
      return String.format("%s: $%,.2f; %s: %.2f; %s: %.2f",    
         "base salary", getBaseSalary(),              
         "gross sales", getGrossSales(),                       
         "commission rate", getCommissionRate());
   }    
}
