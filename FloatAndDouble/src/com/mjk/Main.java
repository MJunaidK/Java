package com.mjk;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);


       // float myFloatValue = 5.25; //double is the default type for decimal
        float myFloatValue = (float) 5.25;
        float myFloatValue1 = 5.25f;
        double myDoubleValue = 5.25d;

        int myIntValue2 = 5;
        float myFloatValue2 = 5f;
        double myDoubleValue2 = 5d;
        System.out.println("MyIntValue2 = " + myIntValue2);
        System.out.println("MyFloatValue2 = " + myFloatValue2);
        System.out.println("MyDoubleValue2 = " + myDoubleValue2);

        int myIntValue3 = 5 / 3;
        float myFloatValue3 = 5f / 3;
        double myDoubleValue3 = 5d / 3;
        System.out.println("MyIntValue3 = " + myIntValue3);
        System.out.println("MyFloatValue3 = " + myFloatValue3);
        System.out.println("MyDoubleValue3 = " + myDoubleValue3);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms=" + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
