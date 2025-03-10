class Item {
    static int objectCount = 0; //the static keyword indicates that it belongs to the class itself.
    String itemName; //instance variables
    
    public Item(String itemName){
        this.itemName = itemName;
        objectCount++:
    }
    
    public static void displayObjectCount(){ //this method belongs to a class
        System.out.println("Total objects created: " + objectCount);
    }
    
    public void displayItem(){
        System.out.println("Item: " + itemName);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");
        
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();
        
        Item.displayObjectCount(); //static method: can be called even without creating an object.
    }
}