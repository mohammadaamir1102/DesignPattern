package com.aamir.designPattern.factory;

public class MBADepartment implements College {
    @Override
    public Double courseFees() {
        System.out.println("MBA fees");
        return 75000d;
    }
}
