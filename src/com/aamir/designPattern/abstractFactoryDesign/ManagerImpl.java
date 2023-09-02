package com.aamir.designPattern.abstractFactoryDesign;

public class ManagerImpl extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
