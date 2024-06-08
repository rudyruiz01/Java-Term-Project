public class TermProject {
    public static void main(String[] args) {
        //Displaying employees and their different compensation models
        CommissionCompensationModel compensation1 = new CommissionCompensationModel(1300.00, 0.10);
        Employee employee1 = new CommissionEmployee("John", "Smith", "12345", compensation1);

        BasePlusCommissionCompensationModel compensation2 = new BasePlusCommissionCompensationModel(3000.00, 0.35, 1800.00);
        Employee employee2 = new BasePlusCommissionEmployee("Karen", "Price", "22222", compensation2);       

        // Displaying original employees compensation packages
        System.out.printf("Employee 1 initial compensation: $%s%n", employee1.earnings());
        System.out.printf("Employee 2 initial compensation: $%s%n", employee2.earnings());

        // Swapping the compensation packages of employee1 and employee2
        employee1.setCompensation(compensation2);
        employee2.setCompensation(compensation1);

        // Displaying earnings after swapping compensation packages
        System.out.printf("Employee 1 after switch compensation: $%s%n", employee1.earnings());
        System.out.printf("Employee 2 after switch compensation: $%s%n", employee2.earnings());
    }
}