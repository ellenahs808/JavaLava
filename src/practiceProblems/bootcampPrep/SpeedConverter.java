package practiceProblems.bootcampPrep;

public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour * 0.6214);
        }
    }


    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));  //→ should return value 1);
        System.out.println(toMilesPerHour(10.25));  //→ should return value 6);
        System.out.println(toMilesPerHour(-5.6));  //→ should return value -1);
        System.out.println(toMilesPerHour(25.42));  //→ should return value 16);
        System.out.println(toMilesPerHour(75.114));  //→ should return value 47);



//        toMilesPerHour(1.5);  //→ should return value 1
//        toMilesPerHour(10.25);  //→ should return value 6
//        toMilesPerHour(-5.6);  //→ should return value -1
//        toMilesPerHour(25.42);  //→ should return value 16
//        toMilesPerHour(75.114);  //→ should return value 47
    }
}
