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

        Noodle spag;
        spag = new Spaghetti();
        // ramen = new Ramen();
//        Ramen ramen = new Ramen();
//        pho = new Pho();

        System.out.println(spag.getCookPrep());
//        System.out.println(ramen.onlyRamen());

    }

}
