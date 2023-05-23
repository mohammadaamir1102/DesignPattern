package com.aamir.designPattern.factory;

public class CollegeFactory {

    public static College getFeesDepartment(String feesDepartment) {
        if (feesDepartment.trim().equalsIgnoreCase("BCA Department")) {
            return new BCADepartment();
        } else if (feesDepartment.trim().equalsIgnoreCase("BTeach Department")) {
            return new BTeachDepartment();
        } else if (feesDepartment.trim().equalsIgnoreCase("MBA Department")) {
            return new BTeachDepartment();
        } else {
            return null;
        }

    }
}
