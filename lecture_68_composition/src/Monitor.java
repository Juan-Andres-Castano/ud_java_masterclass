public class Monitor {

    private String Model;
    private String Manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        Model = model;
        Manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }


    public void drawPixelAt(int x, int y, String color){

          System.out.println("Drawing pixel at " + x + " , " + y + " in color" + color);


        }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
