package com.aamir.designPattern.abstractFactoryDesign;

public class AndroidDeveloperFactoryImpl extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
