package com;

public class Conversions {
    public static void main(String[] args) {
        float floatVal = 1.0f; //can specify 'f' at the end of value for float
        double doubleVal = 4.0d; ////can specify 'd' at the end of value for double
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5l; //can specify 'l' at the end of value for long

        short result1 = (short) longVal; //incompatible types short and long, so you can add short before longVal value to convert it to short
        short result2 = (short) (byteVal - longVal); // byteVal and longVal needs to be within a parenthesis for its value to be converted to short
        long result3 = (long) (longVal - floatVal); // this might not provide an accurate value if converting to long instead of float
        float result4 = longVal - floatVal; //this is a better way to convert it to get a more accurate value

        System.out.println("Success");
    }
}
