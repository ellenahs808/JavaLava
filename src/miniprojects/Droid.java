package miniprojects;

public class Droid {
    //instance fields
    int batteryLevel;
    String name;

    //constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    //main function
    public static void main(String[] args) {
        Droid newDroid = new Droid("Codey");
        System.out.println(newDroid);
        newDroid.energyReport();
        //above will output: "My current battery level is: 100"
        newDroid.performTask("cleaning");
        // System.out.println(newDroid);
        newDroid.energyReport();
        //above will output: "My current battery level is: 90"
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    //performTask method, does not return a value so use 'void'
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println("My current battery level is " + batteryLevel);
    }

}
