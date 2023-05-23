package com.aamir.designPattern.factory;

public class BTeachDepartment implements College{
    @Override
    public Double courseFees() {
        System.out.println("BTeach Fees ");
        return 110000d;
    }
}
