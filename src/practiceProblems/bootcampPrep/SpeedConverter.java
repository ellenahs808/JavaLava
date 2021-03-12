package practiceProblems.bootcampPrep;

public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

    }


    public void printConversion(double kilometersPerHour) {
        long conversion = toMilesPerHour(kilometersPerHour);
        // "XX km/h = YY mi/h"
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " +  conversion + " mi/h");
        }
    }




    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));  //→ should return value 1);
        System.out.println(toMilesPerHour(10.25));  //→ should return value 6);
        System.out.println(toMilesPerHour(-5.6));  //→ should return value -1);
        System.out.println(toMilesPerHour(25.42));  //→ should return value 16);
        System.out.println(toMilesPerHour(75.114));  //→ should return value 47);


        SpeedConverter test1 = new SpeedConverter();

        test1.printConversion(1.5);   //→ should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
        test1.printConversion(10.25);   //→ should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
        test1.printConversion(-5.6);   //→ should print the following text (into the console - System.out): Invalid Value
        test1.printConversion(25.42);   //→ should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
        test1.printConversion(75.114);   //→ should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h



    }
}
