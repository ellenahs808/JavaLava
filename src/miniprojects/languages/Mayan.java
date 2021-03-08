package miniprojects.languages;

class Mayan extends Language {
    Mayan(String languageName, int numSpeakers) { // need to pass in 2 params: languageName and numSpeakers when instantiating a new Mayan Language

        super(languageName, numSpeakers, "Central America", "verb-object-subject"); // here, Central America and verb-subject-object are the default values for regionsSpoken and wordOrder, respectfully
    }

    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }

}