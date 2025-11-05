package com.codegnan.oopexamples;

public class Employee {
         int id;
      String name;
         String department;
//default constructor
         public  Employee() {
        	 this(0,"unknown");
        	 System.out.println("Default constructor called");
      
         }
         public Employee(int id,String name) {
        	this(id,name,"unassigned");
        	 System.out.println("2-parameter constructor called");
         }
         public Employee(int id,String name,String department) {
        	 this.name=name;
         this.id=id;
         this.department=department;
        	 System.out.println("3-parameter constructor called");
}
         public void displayInfo() {
        	 System.out.println("Employee Id:"+this.id);
        	 System.out.println("Employee Name:"+this.name);
        	 System.out.println("Department:"+this.department);
         }
         public static void main(String[] args) {
        	 Employee e1=new Employee(101,"pavani");
        	 e1.displayInfo();
         }
}
