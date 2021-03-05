package miniprojects;

//This program will identify whether there is a protein strand of DNA

public class DNA {
    public static void main(String[] args) {
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
//        String dna2 = "ATGCGATACGTGA";
//        String dna3 = "ATTAATATGTACTGA";

        // String dna1 = new DNA()

        // System.out.println(isProtein(dna2));
        String dna = dna1;
        System.out.println(dna.length());

        int length = dna.length();

        int firstIdx = dna.indexOf("ATG");
        int lastIdx = dna.indexOf("TGA");
        String inBetween = dna.substring(3, length - 3);
        System.out.println(inBetween);
        int lengthBetween = inBetween.length();

        if (firstIdx == 0 && lastIdx == length - 3 && lengthBetween % 3 == 0) {
            System.out.println("Contains protein");
        } else {
            System.out.println("Does not contain a protein");
        }
    }

    // public boolean isProtein(String dnaString) {
    //   int length = dnaString.length();

    //   if (dnaString.length() % 3 != 0) {
    //     return false;
    //   } else if (dnaString.substring(0, 4) != "ATG") {
    //     return false;
    //   } else if (dnaString.substring(length - 3) != "TGA") {
    //     return false;
    //   }

    // return true;

    // }
}
