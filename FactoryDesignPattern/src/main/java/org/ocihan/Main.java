package org.ocihan;

import org.ocihan.factory.GetPlanFactory;
import org.ocihan.factory.Plan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY PATTERN");

        Scanner sc = new Scanner(System.in);
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated: ");
        String planType = sc.nextLine();
        System.out.println("Enter the number of units for bill will be calculated: ");
        int units = sc.nextInt();

        Plan plan = planFactory.getPlan(planType);

        System.out.printf("Bill amount for %s of %d units is: ", planType, units);
        plan.getRate();
        plan.calculateBill(units);

    }

}

/*
A Factory Pattern or Factory Method Pattern says that just define an
interface or abstract class for creating an object but let the subclasses
decide which class to instantiate.

The factory pattern is also known as Virtual Constructor
 */