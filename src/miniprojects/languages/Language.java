package miniprojects.languages;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        //need to use this keyword to specify that you want to initialize the instance variables and not the parameter variables
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {
        // Language tagalog = new Language("Tagalog", 77777, "Luzon, Visayas and Mindanao", "verb-subject-object");

        // // tagalog.getInfo();

        // Language chontal = new Mayan("Chontal", 100000);
        // // chontal.getInfo();

        // Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 20000);
        // mandarinChinese.getInfo();

        // Language burmese = new SinoTibetan("Burmese", 150000);
        // burmese.getInfo();


        //above statements could also be written like this:
//        Language tagalog, chontal, mandarinChinese, burmese;
//        tagalog = new Language("Tagalog", 77777, "Luzon, Visayas and Mindanao", "verb-subject-object");
//        chontal = new Mayan("Chontal", 100000);
//        mandarinChinese = new SinoTibetan("Mandarin Chinese", 20000);
//        burmese = new SinoTibetan("Burmese", 150000);
//
//        //add in an array and call each of the languages with getInfo()
//        Language[] allLanguages = {tagalog, chontal, mandarinChinese, burmese};
//
//        for (Language language : allLanguages) {
//            language.getInfo();
//        }

    }

}