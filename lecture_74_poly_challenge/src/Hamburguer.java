public class Hamburguer {


    private String name;
    private String meat;
    private double price;
    private String breadRollType;


    private String addtion1Name;
    private double addtion1Price;

    private String addtion2Name;
    private double addtion2Price;

    private String addtion3Name;
    private double addtion3Price;

    private String addtion4Name;
    private double addtion4Price;

    public Hamburguer(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburguerAddition1(String name, double price){
        this.addtion1Name = name;
        this.addtion1Price = price;
    }

    public void addHamburguerAddition2(String name, double price){
        this.addtion2Name = name;
        this.addtion2Price = price;
    }

    public void addHamburguerAddition3(String name, double price){
        this.addtion3Name = name;
        this.addtion3Price = price;
    }

    public void addHamburguerAddition4(String name, double price){
        this.addtion4Name = name;
        this.addtion4Price = price;
    }


    public double itemsizeHamburguer(){
        double hamburguerPrice = this.price;
        System.out.println(this.name + "hamburguer on a " + this.breadRollType + "roll with " + this.meat
                    + "price is " + this.price);

        if(this.addtion1Name != null){
            hamburguerPrice += this.addtion1Price;
            System.out.println( "added" + this.addtion1Name + " for an extra" + this.addtion1Price);
        }

        if(this.addtion2Name != null){
            hamburguerPrice += this.addtion2Price;
            System.out.println( "added" + this.addtion2Name + " for an extra" + this.addtion2Price);
        }
        if(this.addtion3Name != null){
            hamburguerPrice += this.addtion3Price;
            System.out.println( "added" + this.addtion3Name + " for an extra" + this.addtion3Price);
        }
        if(this.addtion4Name != null){
            hamburguerPrice += this.addtion4Price;
            System.out.println( "added" + this.addtion4Name + " for an extra" + this.addtion4Price);
        }

        return hamburguerPrice;

    }



}
