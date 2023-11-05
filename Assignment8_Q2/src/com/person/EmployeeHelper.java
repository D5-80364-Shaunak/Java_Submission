package com.person;

public class EmployeeHelper {
    public static double avgSalLabors(Employee[] arr){
        int number = arr.length;
        double netSal = 0.0;
        for (Employee ele: arr) {
            netSal += ele.calcSal();
        }
        return netSal/number;
    }

    public static double avgSalSalesman(Employee[] arr){


    }

    public static double avgSalClerks(Employee[] arr) {

    }
}