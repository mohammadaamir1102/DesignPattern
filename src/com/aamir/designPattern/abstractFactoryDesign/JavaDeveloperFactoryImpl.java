package com.aamir.designPattern.abstractFactoryDesign;

public class JavaDeveloperFactoryImpl extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
