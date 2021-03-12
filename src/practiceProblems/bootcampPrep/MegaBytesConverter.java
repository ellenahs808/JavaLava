package practiceProblems.bootcampPrep;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        //   "XX KB = YY MB and ZZ KB".

        // XX represents the original value kiloBytes.
        // YY represents the calculated megabytes.
        // ZZ represents the calculated remaining kilobytes.

        //  For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

        // 1 MB = 1024 KB
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder = kiloBytes % 1024;
            int mb = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and "+ remainder + " KB");
        }

    }


    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);    //→ "2500 KB = 2 MB and 452 KB"

        printMegaBytesAndKiloBytes(-1024);    //→ "Invalid Value" because parameter is less than 0.

        printMegaBytesAndKiloBytes(5000);    //→ "5000 KB = 4 MB and 904 KB"
    }
}
