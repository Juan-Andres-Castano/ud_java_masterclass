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

    public void modifyGroceryItem(String currentItem,String newItem){
    int position = findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){

        groceryList.set(position, newItem);
        System.out.println(" grocery item "  + (position +1) + " has beedn modified");

    }


    public void removeGroceryItem(String Item){
        int position = findItem(Item);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){

       // String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);

    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>= 0){
            return true;
        }
        return false;

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
