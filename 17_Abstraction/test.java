abstract class Employee{
      int x =10;
      abstract  void calcSalary(); //object of such class cant be created
      void EmployeeWork(){
        System.out.println("Employee is working currently");
      }
}

class Software extends Employee{
    // 1. complete defintion
    void calcSalary(){
        System.out.println("Software engineer salary");
    }
}

abstract class HR extends Employee{
    @Override
    abstract void calcSalary(); //2 itself become abstract
}

public class test{
    public static void main(String[] args) {
        System.out.println("hi");
        Software s = new Software();
        s.calcSalary();
        // Employee e = new Employee(); //error
        System.out.println(s.x);
        s.EmployeeWork();
    }
}