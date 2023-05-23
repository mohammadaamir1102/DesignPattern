package com.aamir.designPattern.factory;

public class FeesCounter {

    public static void main(String[] args) {
        College bcaDepartment = new BCADepartment();
        /*
         * It is tightly couple class here creating the object  without input or requirement
         */

        College bcaDepartmentObject = CollegeFactory.getFeesDepartment("BCA Department");
        System.out.println(bcaDepartmentObject != null ? bcaDepartmentObject.courseFees() : null);
        System.out.println("+++++++++++++++++++");

        College bTeachDepartmentObject = CollegeFactory.getFeesDepartment("BTeach Department");
        System.out.println(bTeachDepartmentObject != null ? bTeachDepartmentObject.courseFees() : null);
        System.out.println("++++++++++++++++++++");

        College mbaDepartmentObject = CollegeFactory.getFeesDepartment("MBA Department");
        System.out.println(mbaDepartmentObject != null ? mbaDepartmentObject.courseFees() : null);

    }
}
