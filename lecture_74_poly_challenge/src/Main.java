public class Main {

    public static void main(String[] args){

    Hamburguer hamburguer = new Hamburguer("basic", "sausage", 3.56, "white");
    double price = hamburguer.itemsizeHamburguer();
    hamburguer.addHamburguerAddition1("tomate",0.27);
    hamburguer.addHamburguerAddition2("letuce", 0.75);
    hamburguer.addHamburguerAddition3("Cheese", 1.13);
        System.out.println("total price = " + hamburguer.itemsizeHamburguer());

        HealtyBurguer healthtyBurguer = new HealtyBurguer("Bacon",5.67);
     //   healthtyBurguer.itemsizeHamburguer();
        healthtyBurguer.addHamburguerAddition1("egg", 5.43);
     //   healthtyBurguer.itemsizeHamburguer();
        healthtyBurguer.addHealthAddition1("Lentils", 3.41);
        System.out.println("total healty burger price is : " + healthtyBurguer.itemsizeHamburguer());



        DeluxeHamburguer db = new DeluxeHamburguer();
        db.itemsizeHamburguer();
        db.addHamburguerAddition1("should not do this, ", 50.53);
        db.itemsizeHamburguer();
    }

}
