import java.util.ArrayList;

public class GroceryList {

 //private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceyItem(String item){
  //      myNumbers[5] = 4;
//
        groceryList.add(item);

    }

    public void printGroceryList(){
        System.out.println("you have" + groceryList.size() + "items in your grocery list");

        for(int i=0; i<groceryList.size(); i++){
            System.out.println( (i+1) + " . " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String newItem){

    }

    public void modifyGroceryItem(int position, String newItem){

        groceryList.set(position, newItem);
        System.out.println(" grocery item "  + (position +1) + " has beedn modified");

    }

    public void removeGroceryItem(int position){

        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    public String findItem(String searchItem){

        //boolean exist = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return groceryList.get(position);
        }
        return null;
    }

}
