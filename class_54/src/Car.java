


public class Car {


    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String color;

public void setModel(String model){
    String validModel = model.toLowerCase();
    if( validModel.equals("porsche1") || validModel.equals("honda")){
        this.model = model ;
    }else{

        this.model = "unknow" ;

    }


}
    public String getModel(){
    return this.model;


    }




}
