# Java Term Project

## Purpose Of This Program
A Java program that demonstrates several foundational object-oriented programming principles: classes, objects, abstract classes, inheritance, and polymorphism.

## About The Program
When two or more similar objects share attributes, it is useful to create a superclass that contains those shared attributes. From this superclass, we create subclasses that contain attributes distinct to the descending objects. 

In a company, employees are compensated in different ways. For example, some employees are paid solely on commission while others are given a base pay and commission. Despite their differences, they are both employees who share common attributes. In our example, all employees must be paid, and for this reason, they must belong to a class with compensation attributes. We never need an employee without compensation, which is a great case for an abstract class.

`Employee.java` contains an abstract Employee class. It holds the basic information for any employee. Below are the Employee attributes; the class also contains the appropriate setters and getters (not shown).
```java
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;
  private CompensationModel compensation;
```
Each employee has a `CompensationModel` attribute, a superclass for the compensation model subclasses available. Because the attribute is set to a superclass, we can take advantage of polymorphism in our program. Our Employee class can now handle subclasses of the CompensationModel class. If an employee is to change compensation models halfway through their employment, we can update their profile with the `setCompensation()` method, eliminating the need to create a whole new Employee object.

From the CompensationModel class, we extend the `CommissionCompensationModel` class and the `BasePlusCommissionCompensationModel` class. We then create the `BasePlusCommissionEmployee` class and the `CommissionEmployee` class.

Lastly, we test our program in `TermProject.java`. Here we demonstrate by creating two employees with two different compensation models and then displaying the output: one earning commission and the other earning base pay plus commission.
```java
  CommissionCompensationModel compensation1 = new CommissionCompensationModel(1300.00, 0.10);
  Employee employee1 = new CommissionEmployee("John", "Smith", "12345", compensation1);

  BasePlusCommissionCompensationModel compensation2 = new BasePlusCommissionCompensationModel(3000.00, 0.35, 1800.00);
  Employee employee2 = new BasePlusCommissionEmployee("Karen", "Price", "22222", compensation2);

  System.out.printf("Employee 1 initial compensation: $%s%n", employee1.earnings());
  System.out.printf("Employee 2 initial compensation: $%s%n", employee2.earnings());
```

Output:
```
  Employee 1 initial compensation: $130.0
  Employee 2 initial compensation: $2850.0
```

We then swap their compensation models to demonstrate that the CompensationModel superclass attribute can handle a compensation model change even after the Employee object was created.
```
  employee1.setCompensation(compensation2);
  employee2.setCompensation(compensation1);
```
Finally, we output the result:
```
  Employee 1 after switch compensation: $2850.0
  Employee 2 after switch compensation: $130.0
```

## Thank you
This concludes my demonstration of my Java programming abilities.
Thank you for taking the time to review my code.



