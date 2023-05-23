package com.aamir.designPattern.factory;

public class BCADepartment implements College{
    @Override
    public Double courseFees() {
        System.out.println("BCA Department Fees");
        return 310000d;
    }
}
