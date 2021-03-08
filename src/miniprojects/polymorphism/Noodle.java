package miniprojects.polymorphism;

class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }

    public static void main(String[] args) {

        Noodle spag, pho, ramen;
//        Noodle spag, pho;

        spag = new Spaghetti();
        pho = new Pho();
        ramen = new Ramen();

//        Ramen ramen = new Ramen();
//        System.out.println(ramen.onlyRamen()); // can only access onlyRamen method if instantiated as a subclass and not a super class

//        System.out.println(spag.getCookPrep());

        //create an array and add spag, pho and ramen
        Noodle[] allTheNoodles = {spag, pho, ramen};

        //iterate through the array and use getCookPrep() method
        for (Noodle noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }

    }

}
