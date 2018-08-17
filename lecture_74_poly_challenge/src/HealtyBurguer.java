public class HealtyBurguer extends Hamburguer {

    private String healthyExtre1Name;
    private double healthyExtra1Price;

    private String healthyExtre2Name;
    private double healthyExtra2Price;


    public HealtyBurguer(String meat, double price) {
        super("Healthy", meat, price, "White rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtre1Name = name;
        this.healthyExtra1Price = price;
    }


    public void addHealthAddition2(String name, double price){
        this.healthyExtre2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemsizeHamburguer() {
        double hamburguerPrice = super.itemsizeHamburguer();
        if(this.healthyExtre1Name != null){
            hamburguerPrice += this.healthyExtra1Price;
            System.out.println("added" + this.healthyExtre1Name + " for an extra" + this.healthyExtra1Price );
        }

        if(this.healthyExtre2Name != null){
            hamburguerPrice += this.healthyExtra2Price;
            System.out.println("added" + this.healthyExtre2Name + " for an extra" + this.healthyExtra2Price );
        }


        return hamburguerPrice;

    }
}
