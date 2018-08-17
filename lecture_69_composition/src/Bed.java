public class Bed {


    private String style;
    private int pilss;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pilss, int height, int sheets, int quilt) {


        this.style = style;
        this.pilss = pilss;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

public void make(){
    System.out.println("Bed -> making ...");


}

    public String getStyle() {
        return style;
    }

    public int getPilss() {
        return pilss;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}


