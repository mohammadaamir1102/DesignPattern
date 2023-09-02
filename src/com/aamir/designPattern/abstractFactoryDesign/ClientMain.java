package com.aamir.designPattern.abstractFactoryDesign;

public class ClientMain {

    public static void main(String[] args) {
        // Get Android Developer
        Employee androidDeveloper = EmployeeFactory.getEmployee(new AndroidDeveloperFactoryImpl());
        System.out.println(androidDeveloper.name() + " and salary is "+ androidDeveloper.salary());

        System.out.println("__________________________________________________________");

        Employee javaDeveloper = EmployeeFactory.getEmployee(new JavaDeveloperFactoryImpl());
        System.out.println(javaDeveloper.name() + " and salary is "+ javaDeveloper.salary());

        System.out.println("__________________________________________________________");

        Employee manager = EmployeeFactory.getEmployee(new ManagerImpl());
        System.out.println(manager.name() + " and salary is "+ manager.salary());
    }
}
