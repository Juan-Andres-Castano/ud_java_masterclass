public class Motherboard {


    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardlots;
    private String Bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardlots = cardlots;
        Bios = bios;
    }

    public void loadProgram(String programName){
         System.out.println("Program" + programName + "is now loading....");

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardlots() {
        return cardlots;
    }

    public String getBios() {
        return Bios;
    }
}
