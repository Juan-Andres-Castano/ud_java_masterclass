public class DeluxeHamburguer extends Hamburguer{

    public DeluxeHamburguer() {
        super("Deluxe", "Sauce & Bacon", 14.53, "White");
        super.addHamburguerAddition1("Chips", 2.75);
        super.addHamburguerAddition2("Drink", 1.81);




    }

    @Override
    public void addHamburguerAddition1(String name, double price) {
       // super.addHamburguerAddition1(name, price);
        System.out.println("cannot add items to a deluxe");
    }

    @Override
    public void addHamburguerAddition2(String name, double price) {
        // super.addHamburguerAddition1(name, price);
        System.out.println("cannot add items to a deluxe");
    }

    @Override
    public void addHamburguerAddition3(String name, double price) {
        // super.addHamburguerAddition1(name, price);
        System.out.println("cannot add items to a deluxe");
    }

    @Override
    public void addHamburguerAddition4(String name, double price) {
        // super.addHamburguerAddition1(name, price);
        System.out.println("cannot add items to a deluxe");
    }
}
