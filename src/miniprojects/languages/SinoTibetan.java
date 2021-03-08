package miniprojects.languages;

class SinoTibetan extends Language {
    SinoTibetan(String languageName, int numSpeakers) {
        super(languageName, numSpeakers, "Asia", "subject-object-verb");
        if (languageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }


}